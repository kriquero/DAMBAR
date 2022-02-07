package com.dambar.service;

import com.dambar.domain.Comanda;

import java.util.Optional;
import java.util.Set;

public interface ComandaService {

    Set<Comanda> findAll();
    Optional<Comanda> findById(long id);
    void deleteComanda(long id);

    Comanda modifyComanda(long id, Comanda newComanda);

    Comanda addComanda(Comanda comanda);

}
