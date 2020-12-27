package com.honeycomb.springWebApp.repositories;

import com.honeycomb.springWebApp.domain.Distributor;
import org.springframework.data.repository.CrudRepository;

public interface DistributorRepository extends CrudRepository<Distributor, Long> {
}
