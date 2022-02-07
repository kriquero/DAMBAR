package com.dambar.repository;


import com.dambar.domain.Comanda;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;
import java.util.Set;

public interface ComandaRepository extends CrudRepository<Comanda, Long> {
    Set<Comanda> finfall();
    Optional<Comanda> findById(long id);

}
