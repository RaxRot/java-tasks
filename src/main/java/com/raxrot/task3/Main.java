package com.raxrot.task3;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        LibraryService library = new LibraryServiceImpl();
        Book book1=new Book("One");
        Book book2=new Book("Two");
        Book book3=new Book("Three");

        System.out.println("------------------");
        System.out.println("Add books");
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        System.out.println("------------------");

        System.out.println("------------------");
        System.out.println("All books");
        List<Book> allBooks = library.getAllBooks();
        allBooks.forEach(System.out::println);
        System.out.println("------------------");


        System.out.println("------------------");
        System.out.println("Get Book by  2");
        Book book=library.getBookById(2);
        System.out.println(book.getTitle() + " " + book.getId());
        System.out.println("------------------");

        System.out.println("------------------");
        System.out.println("Delete book with id 1");
        library.deleteBook(1);
        System.out.println("Library after deletion is");
        library.getAllBooks().forEach(System.out::println);
    }
}
