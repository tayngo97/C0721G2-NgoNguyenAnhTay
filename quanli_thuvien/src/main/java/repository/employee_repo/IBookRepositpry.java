package repository.employee_repo;

import bean.Book;

import java.util.List;

public interface IBookRepositpry {
    List<Book> findAll();
    void save(Book book);
    void remove(int id);
    Book findById(int id);
    void update(Book employee);
    List<Book> findByCountry(String country);
    List<Book> sortByName();
}
