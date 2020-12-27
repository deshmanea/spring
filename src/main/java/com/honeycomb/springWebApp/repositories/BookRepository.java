package com.honeycomb.springWebApp.repositories;

import com.honeycomb.springWebApp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
    
}
