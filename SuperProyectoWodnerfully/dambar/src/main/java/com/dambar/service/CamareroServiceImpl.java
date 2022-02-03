package com.dambar.service;

import com.dambar.domain.Camarero;
import com.dambar.exceptions.CamareroNotFoundException;
import com.dambar.repository.CamareroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;

@Service
public class CamareroServiceImpl implements CamareroService{

    @Autowired
    private CamareroRepository camareroRepository;

    @Override
    public Set<Camarero> findAll() {
        return camareroRepository.findAll();
    }

    @Override
    public Optional<Camarero> findById(long id) {
        return camareroRepository.findById(id);
    }

    @Override
    public void deleteCamarero(long id) {
        camareroRepository.deleteById(id);
    }

    @Override
    public Camarero modifyCamarero(long id, Camarero newCamarero) {
        Camarero oldCamarero = camareroRepository.findById(id)
                .orElseThrow(()-> new CamareroNotFoundException(id));
        newCamarero.setIdCamarero(id);
        return camareroRepository.save(newCamarero);

    }

    @Override
    public Camarero addCamarero(Camarero camarero) {
        return camareroRepository.save(camarero);
    }
}
