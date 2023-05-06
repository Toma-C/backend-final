/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argprog.back.service;

import com.argprog.back.model.Educacion;
import com.argprog.back.repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService implements IEducacionService{

    @Autowired
    private EducacionRepository educacionRepository;

    @Override
    public List<Educacion> getEducaciones() {
        return educacionRepository.findAll();
    }

    @Override
    public void saveEducacion(Educacion e) {
        educacionRepository.save(e);
    }

    @Override
    public void deleteEducacion(Long id) {
        educacionRepository.deleteById(id);
    }

    @Override
    public Educacion findEducacion(Long id) {
        Educacion e = (Educacion) educacionRepository.findById(id).orElse(null);
        return e;
    }

    @Override
    public List<Educacion> findEducacionesPorPersona(Long personas_id) {
        List<Educacion> educaciones = educacionRepository.findByPersona(personas_id);
        return educaciones;
    }
    
    
}
