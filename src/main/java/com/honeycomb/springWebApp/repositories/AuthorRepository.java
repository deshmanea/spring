package com.honeycomb.springWebApp.repositories;

import com.honeycomb.springWebApp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
