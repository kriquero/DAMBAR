package com.dambar.repository;


import com.dambar.domain.Comanda;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.Set;
@Repository
public interface ComandaRepository extends CrudRepository<Comanda, Long> {
    Set<Comanda> findAll();
    Optional<Comanda> findById(long id);

}
