package com.raxrot.task3;

import java.util.List;

public interface LibraryService {
    Book addBook(Book book);
    List<Book> getAllBooks();
    Book getBookById(Integer id);
    boolean deleteBook(Integer id);
}
