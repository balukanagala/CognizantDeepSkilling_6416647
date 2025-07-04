package org.example;

import org.example.Respository.BookRepository;
import org.example.Service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService = context.getBean("bookService",BookService.class);
        bookService.greetings();

        BookRepository bookRepo = context.getBean("bookRepo",BookRepository.class);
        bookRepo.greetingsRepo();
    }
}
