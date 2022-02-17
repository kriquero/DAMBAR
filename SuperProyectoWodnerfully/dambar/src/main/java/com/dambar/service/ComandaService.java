package com.dambar.service;

import com.dambar.domain.Camarero;
import com.dambar.domain.Comanda;
import com.dambar.domain.LineaComanda;

import java.util.Optional;
import java.util.Set;

public interface ComandaService {

    Set<Comanda> findAll();
    Optional<Comanda> findById(long id);
    void deleteComanda(long id);

    Comanda modifyComanda(long id, Comanda newComanda);

    Comanda addLinea(long id, LineaComanda linea);

    Comanda deleteLinea(long idComanda, long idLinea);

    Comanda addCamarero(long id, Camarero camarero);

    Comanda deleteCamarero(long idComanda);

    Comanda addComanda(Comanda comanda);

}
