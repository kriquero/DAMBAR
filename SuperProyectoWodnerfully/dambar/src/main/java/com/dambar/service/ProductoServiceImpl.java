package com.dambar.service;


import com.dambar.domain.Producto;
import com.dambar.exceptions.MesaNotFoundException;
import com.dambar.exceptions.ProductoNotFoundException;
import com.dambar.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;
import java.util.Set;

@Service
@Transactional
public class ProductoServiceImpl implements ProductoService{

    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public Set<Producto> findAll() {
        return productoRepository.findAll();
    }

    @Override
    public Optional<Producto> findByTipo(String tipo) {
        return productoRepository.findByTipo(tipo);
    }

    @Override
    public Optional<Producto> findById(long id) {
        return productoRepository.findById(id);
    }

    @Override
    public Producto addProducto(Producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    public Producto modifyProducto(long id, Producto newProducto) {
        Producto producto = productoRepository.findById(id).orElseThrow(()-> new ProductoNotFoundException(id));
        newProducto.setId(producto.getId());
        return productoRepository.save(newProducto);
    }

    @Override
    public void deleteProducto(long id) {
        productoRepository.findById(id).orElseThrow(()-> new MesaNotFoundException(id));
        productoRepository.deleteById(id);

    }
}
