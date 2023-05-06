/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argprog.back.controller;

import com.argprog.back.model.Datos;
import com.argprog.back.service.IEducacionService;
import com.argprog.back.service.IExperienciaService;
import com.argprog.back.service.IPersonaService;
import java.util.HashSet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DatosController {
    @Autowired
    private IExperienciaService expService;
    @Autowired
    private IEducacionService eduService;
    @Autowired
    private IPersonaService personaService;
    
    @GetMapping("/datos/{id}")
    public Datos getDatos(@PathVariable Long id){
        Datos datos = new Datos();
        datos.setPersona(personaService.findPersona(id));
        datos.setEducaciones(eduService.findEducacionesPorPersona(id));
        datos.setExperiencias(expService.findExperienciasPorPersona(id));
        return datos;
    }
}
