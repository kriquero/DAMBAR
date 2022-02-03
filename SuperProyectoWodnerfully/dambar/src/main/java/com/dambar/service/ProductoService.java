package com.dambar.service;

import com.dambar.domain.Producto;

import java.util.Optional;
import java.util.Set;

public interface ProductoService {
    Set<Producto> findAll();
    Set<Producto> findByTipo(String tipo);
    Optional<Producto> findById(long id);
    Producto addProducto(Producto producto);
    Producto modifyProducto(long id, Producto producto);
    void deleteProducto(long id);
}
