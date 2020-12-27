package com.honeycomb.springWebApp.repositories;

import com.honeycomb.springWebApp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher,Long> {
}
