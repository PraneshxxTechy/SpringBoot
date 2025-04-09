package com.project.bookApp.service;
import java.util.*;
import com.project.bookApp.model.Book;
import com.project.bookApp.BookApplication;
import com.project.bookApp.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    private final BookRepository bookRepository;
    @Autowired
    public BookService(@Qualifier("dbRepo")BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }
    public List<Book> getBooks(){
        return bookRepository.findBooks();
    }
}
