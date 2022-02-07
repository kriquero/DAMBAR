package com.dambar.service;

import com.dambar.domain.LineaComanda;
import com.dambar.exceptions.LineaComandaNotFoundException;
import com.dambar.repository.LineaComandaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;
import java.util.Set;

@Service
@Transactional
public class LineaComandaServiceImpl implements LineaComandaService{

    @Autowired
    private LineaComandaRepository lineaRepository;

    @Override
    public Set<LineaComanda> findAll() {
        return lineaRepository.findAll();
    }

    @Override
    public Optional<LineaComanda> findById(long id) {
        return lineaRepository.findById(id);
    }

    @Override
    public LineaComanda addLineaComanda(LineaComanda lineaComanda) {
        return lineaRepository.save(lineaComanda);
    }

    @Override
    public LineaComanda modifyLineaComanda(long id, LineaComanda newLineaComanda) {
        LineaComanda linea = lineaRepository.findById(id).orElseThrow(()-> new LineaComandaNotFoundException(id));
        newLineaComanda.setId(linea.getId());
        return lineaRepository.save(newLineaComanda);
    }

    @Override
    public void deleteLineaComanda(long id) {
        lineaRepository.findById(id).orElseThrow(()-> new LineaComandaNotFoundException(id));
        lineaRepository.deleteById(id);
    }
}
