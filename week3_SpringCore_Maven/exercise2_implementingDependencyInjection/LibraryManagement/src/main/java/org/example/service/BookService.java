package org.example.service;

import org.example.repository.BookRepository;

public class BookService {
    private BookRepository bookRepo;

    public void setBookRepo(BookRepository bookRepo){
        this.bookRepo = bookRepo;
    }

    public void addBook(String bookName){
        System.out.println("Adding book using book Service");
        bookRepo.saveBook((bookName));
    }
}
