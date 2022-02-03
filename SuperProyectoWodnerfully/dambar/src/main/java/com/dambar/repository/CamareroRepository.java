package com.dambar.repository;

import com.dambar.domain.Camarero;

import java.util.Optional;
import java.util.Set;
import org.springframework.data.repository.CrudRepository;

public interface CamareroRepository extends CrudRepository<Camarero, Long> {

    Set<Camarero> findAll();
    Optional<Camarero> findById(long id);

}
