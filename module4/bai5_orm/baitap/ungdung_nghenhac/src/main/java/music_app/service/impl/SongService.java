package music_app.service.impl;

import music_app.model.Song;
import music_app.service.ISongService;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import java.util.List;

@Service
public class SongService implements ISongService {

    private static SessionFactory sessionFactory;
    private static EntityManager entityManager;

    static {
        try {
            sessionFactory = new Configuration().configure("hibernate.conf.xml").buildSessionFactory();
            entityManager = sessionFactory.createEntityManager();
        } catch (HibernateException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Song> showListSong() {
        String queryStr = "SELECT s FROM Song AS s";
        TypedQuery<Song> query = entityManager.createQuery(queryStr, Song.class);
        return query.getResultList();
    }

    @Override
    public Song showDetailSong(int id) {
        Song song = entityManager.find(Song.class, id);
        return song;
    }

    @Override
    public void addSong(Song song) {
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        entityManager.persist(song);
        entityTransaction.commit();
    }

    @Override
    public void editSong(Song song) {

    }

    @Override
    public void delete(int id) {
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        entityManager.remove(showDetailSong(id));
    }

    @Override
    public List<Song> searchName(String name) {
            String queryStr = "SELECT s FROM Song AS s where s.name = name";
            TypedQuery<Song> query = entityManager.createQuery(queryStr, Song.class);
            return query.getResultList();

    }
}
