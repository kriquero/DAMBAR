package com.dambar.service;

import com.dambar.domain.LineaComanda;

import java.util.Optional;
import java.util.Set;

public interface LineaComandaService {
    Set<LineaComanda> findAll();
    Optional<LineaComanda> findById(long id);
    LineaComanda addLineaComanda(LineaComanda lineaComanda);
    LineaComanda modifyLineaComanda(long id, LineaComanda lineaComanda);
    void deleteLineaComanda(long id);
}
