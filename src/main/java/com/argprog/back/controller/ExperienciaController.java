
package com.argprog.back.controller;

import com.argprog.back.model.Experiencia;
import com.argprog.back.service.IExperienciaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExperienciaController {
    @Autowired
    private IExperienciaService iExpService;
    
    @GetMapping("/experiencias/{id}")
    private List<Experiencia> getExperiencias(@PathVariable Long id){
        return iExpService.findExperienciasPorPersona(id);
    }
    
    @PostMapping("/experiencias/crear")
    public String crearExp(@RequestBody Experiencia e){
        iExpService.saveExperiencia(e);
        return "Experiencia creada con exito";
    }
    
    @DeleteMapping("/experiencias/eliminar/{id}")
    public String eliminarPersona(@PathVariable Long id){
        iExpService.deleteExperiencia(id);
        return "Experiencia de id " + id.toString() + " eliminada con exito";
    }
    
    
}
