package com.project.bookApp.repository;
import com.project.bookApp.model.Book;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.*;
@Repository
@Primary
public class InMemoryBookRepository implements BookRepository{
    @Override
    public List<Book> findBooks(){
        return Arrays.asList(new Book("1","Spring in Action"),
                new Book("2","Java development"));
    }
}
