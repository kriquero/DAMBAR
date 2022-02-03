package com.dambar.repository;

import com.dambar.domain.Mesa;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.Set;

@Repository
public interface MesaRepository extends CrudRepository<Mesa, Long> {
    Set<Mesa> findAll();
}
