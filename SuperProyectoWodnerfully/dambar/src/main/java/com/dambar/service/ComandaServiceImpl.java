package com.dambar.service;

import com.dambar.domain.Camarero;
import com.dambar.domain.Comanda;
import com.dambar.domain.LineaComanda;
import com.dambar.exceptions.ComandaNotFoundException;
import com.dambar.repository.ComandaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Set;

@Service
public class ComandaServiceImpl implements ComandaService{

    @Autowired
    private ComandaRepository comandaRepository;

    @Override
    public Set<Comanda> findAll() {
        return comandaRepository.findAll();
    }

    @Override
    public Optional<Comanda> findById(long id) {
        return comandaRepository.findById(id);
    }

    @Override
    public void deleteComanda(long id) {
        comandaRepository.deleteById(id);
    }

    @Override
    public Comanda modifyComanda(long id, Comanda newComanda) {

        Comanda oldComanda = comandaRepository.findById(id).
                orElseThrow(()->new ComandaNotFoundException(id));
        newComanda.setIdComanda(id);
        return comandaRepository.save(newComanda);
    }

    @Override
    public Comanda addLinea(long id, LineaComanda linea) {
        Comanda comanda = comandaRepository.findById(id).
                orElseThrow(()->new ComandaNotFoundException(id));
        comanda.getLineaComandas().add(linea);
        return comandaRepository.save(comanda);
    }

    @Override
    public Comanda deleteLinea(long idComanda, long idLinea) {
        Comanda comanda = comandaRepository.findById(idComanda).
                orElseThrow(()->new ComandaNotFoundException(idComanda));
        Set<LineaComanda> lineas = comanda.getLineaComandas();
        for (LineaComanda l: lineas) {
            long id =l.getId();
            if(id==idLinea){
                lineas.remove(l);
            }
        }
        comanda.setLineaComandas(lineas);
        return comandaRepository.save(comanda);
    }

    @Override
    public Comanda addCamarero(long id, Camarero camarero) {
        Comanda comanda = comandaRepository.findById(id).
                orElseThrow(()->new ComandaNotFoundException(id));
        comanda.setCamarero(camarero);
        return comandaRepository.save(comanda);
    }

    @Override
    public Comanda deleteCamarero(long idComanda, long idCamarero) {
        Comanda comanda = comandaRepository.findById(idComanda).
                orElseThrow(()->new ComandaNotFoundException(idComanda));
        long camId = comanda.getCamareroId();
        if(camId==idCamarero) {
            comanda.setCamarero(null);
        }
        return comandaRepository.save(comanda);
    }

    @Override
    public Comanda addComanda(Comanda comanda) {
        return comandaRepository.save(comanda);
    }
}
