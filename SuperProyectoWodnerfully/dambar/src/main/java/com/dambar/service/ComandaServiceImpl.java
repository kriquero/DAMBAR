package com.dambar.service;

import com.dambar.domain.Comanda;
import com.dambar.exceptions.ComandaNotFoundException;
import com.dambar.repository.ComandaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;

@Service
public class ComandaServiceImpl implements ComandaService{

    @Autowired
    private ComandaRepository comandaRepository;

    @Override
    public Set<Comanda> findAll() {
        return comandaRepository.finfall();
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
    public Comanda addComanda(Comanda comanda) {
        return comandaRepository.save(comanda);
    }
}
