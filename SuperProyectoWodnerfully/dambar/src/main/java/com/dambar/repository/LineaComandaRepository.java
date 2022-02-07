package com.dambar.repository;

import com.dambar.domain.LineaComanda;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface LineaComandaRepository extends CrudRepository<LineaComanda, Long> {
    Set<LineaComanda> findAll();
}
