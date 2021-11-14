package service.book_service;

import bean.Book;

import java.util.List;

public interface IBookService {
    List<Book> findAll();
    void save(Book employee);
    void remove(int id);
    Book findById(int id);
    void update(Book employee);
    List<Book> findByCountry(String country);
    List<Book> sortByName();
}
