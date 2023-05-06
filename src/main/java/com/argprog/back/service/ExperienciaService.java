package com.argprog.back.service;

import com.argprog.back.model.Experiencia;
import com.argprog.back.repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService implements IExperienciaService {
    @Autowired
    private ExperienciaRepository expRepository;
    
    @Override
    public List<Experiencia> getExperiencias() {
        return expRepository.findAll();
    }

    @Override
    public Experiencia findExperienciaById(Long id) {
        return expRepository.findById(id).orElse(null);
    }
    @Override
    public void saveExperiencia(Experiencia e) {
        expRepository.save(e);
    }

    @Override
    public void deleteExperiencia(Long id) {
        expRepository.deleteById(id);
    }

    @Override
    public List<Experiencia> findExperienciasPorPersona(Long personas_id) {
        return expRepository.findByPersona(personas_id);
    }
    
}
