package com.dambar.service;

import com.dambar.domain.Mesa;
import com.dambar.exceptions.MesaNotFoundException;
import com.dambar.repository.MesaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;
import java.util.Set;

@Service
@Transactional
public class MesaServiceImpl implements MesaService{

    @Autowired
    private MesaRepository mesaRepository;

    @Override
    public Set<Mesa> findAll(){return mesaRepository.findAll();}

    @Override
    public Optional<Mesa> findById (long id){return mesaRepository.findById(id);}

    @Override
    public Mesa addMesa(Mesa mesa) {
        return mesaRepository.save(mesa);
    }

    @Override
    public Mesa modifyMesa(long id, Mesa newMesa) {
        Mesa mesa = mesaRepository.findById(id)
                .orElseThrow(() -> new MesaNotFoundException(id));
        newMesa.setId(mesa.getId());
        return mesaRepository.save(newMesa);
    }

    @Override
    public void deleteMesa(long id) {
        mesaRepository.findById(id)
                .orElseThrow(()-> new MesaNotFoundException(id));
        mesaRepository.deleteById(id);
    }

}
