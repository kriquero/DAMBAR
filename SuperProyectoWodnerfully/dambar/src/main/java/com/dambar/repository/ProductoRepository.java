package com.dambar.repository;

import com.dambar.domain.Producto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface ProductoRepository extends CrudRepository<Producto, Long> {
    Set<Producto> findAll();
    Set<Producto> findByTipo(String tipo);
}
