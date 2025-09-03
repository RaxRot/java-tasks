package com.raxrot.task3;

import java.util.ArrayList;
import java.util.List;

public class LibraryServiceImpl implements LibraryService {
    private final List<Book>books=new ArrayList<>();
    private int id=0;//не делал ее потокобезопастной так как это тестовое и не вижу смысла-если надо перделаю-
    //я как понял тут просто надо базовый круд показать что понимаешь

    @Override
    public Book addBook(Book book) {
        id++;
        Book bookToAdd=new Book(id,book.getTitle());
        books.add(bookToAdd);
        System.out.println("Added");
        return bookToAdd;
    }

    @Override
    public List<Book> getAllBooks() {
       return books;
    }

    @Override
    public Book getBookById(Integer id) {
        Book bookToFind=books.stream().filter(book -> book.getId()==id).findFirst()
                .orElseThrow(()->new RuntimeException("Book not found"));
        return bookToFind;
    }

    @Override
    public boolean deleteBook(Integer id) {
        boolean isDeleted=books.removeIf(book -> book.getId()==id);
        return isDeleted;
    }
}
