package com.dambar.service;

import com.dambar.domain.Mesa;

import java.util.Optional;
import java.util.Set;

public interface MesaService {
    Set<Mesa> findAll();
    Optional<Mesa> findById(long id);
    Mesa addMesa (Mesa mesa);
    Mesa modifyMesa (long id, Mesa mesa);
    void deleteMesa(long id);
}
