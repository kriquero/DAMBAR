package com.dambar.service;

import com.dambar.domain.Camarero;

import java.util.Optional;
import java.util.Set;

public interface CamareroService {

    Set<Camarero> findAll();
    Optional<Camarero> findById(long id);
    void deleteCamarero(long id);

    Camarero modifyCamarero(long id, Camarero camarero);

    Camarero addCamarero(Camarero camarero);




}
