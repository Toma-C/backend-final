package com.argprog.back.service;

import com.argprog.back.model.Experiencia;
import java.util.List;

public interface IExperienciaService {

    public List<Experiencia> getExperiencias();

    public Experiencia findExperienciaById(Long id);
    
    public void saveExperiencia(Experiencia e);
    public void deleteExperiencia(Long id);

    public List<Experiencia> findExperienciasPorPersona(Long personas_id);
}
