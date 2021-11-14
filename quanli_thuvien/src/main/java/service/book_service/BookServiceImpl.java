package service.book_service;

import bean.Book;
import repository.employee_repo.BookRepository;
import repository.employee_repo.IBookRepositpry;

import java.util.List;

public class BookServiceImpl implements IBookService {
    IBookRepositpry bookRepo = new BookRepository();

    @Override
    public List<Book> findAll() {
        return bookRepo.findAll();
    }

    @Override
    public void save(Book employee) {
        bookRepo.save(employee);
    }

    @Override
    public void remove(int id) {
        bookRepo.remove(id);
    }

    @Override
    public Book findById(int id) {
        return bookRepo.findById(id);
    }

    @Override
    public void update(Book employee) {
        bookRepo.update(employee);
    }

    @Override
    public List<Book> findByCountry(String country) {
        return bookRepo.findByCountry(country);
    }

    @Override
    public List<Book> sortByName() {
        return bookRepo.sortByName();
    }
}
