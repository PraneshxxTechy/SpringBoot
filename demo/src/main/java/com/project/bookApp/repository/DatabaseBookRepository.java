package com.project.bookApp.repository;
import com.project.bookApp.model.Book;
import org.springframework.stereotype.Repository;

import java.util.*;
@Repository("dbRepo")
public class DatabaseBookRepository implements BookRepository{
    @Override
    public List<Book> findBooks(){
        return Collections.singletonList(new Book("3","DB : MySQL"));
    }
}
