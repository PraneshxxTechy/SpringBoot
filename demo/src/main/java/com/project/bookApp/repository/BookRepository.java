package com.project.bookApp.repository;
import com.project.bookApp.model.Book;
import java.util.*;
public interface BookRepository {
    List<Book> findBooks();
}
