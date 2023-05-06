
package com.argprog.back.controller;

import java.util.List;
import com.argprog.back.model.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.argprog.back.service.IPersonaService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
public class PersonaController {
    @Autowired
    private IPersonaService iPersonaService;
    
    @GetMapping("/personas")
    public List<Persona> getPersonas(){
        return iPersonaService.getPersonas();
    }
    @PostMapping("/personas/crear")
    public String crearPersona(@RequestBody Persona p){
        iPersonaService.savePersonas(p);
        return "Persona creada con exito";
    }
    @DeleteMapping("/personas/eliminar/{id}")
    public String eliminarPersona(@PathVariable Long id){
        iPersonaService.deletePersona(id);
        return "Persona de id " + id.toString() + " eliminada con exito";
    }
    @PutMapping("/personas/editar/{id}")
    public Persona editarPersona(@PathVariable Long id,
                                @RequestParam("nombre") String nuevoNombre,
                                @RequestParam("apellido") String nuevoApellido,
                                @RequestParam("domicilio") String nuevoDom,
                                @RequestParam("fecha_nac") String nuevoFecha_nac,
                                @RequestParam("telefono") String nuevoTelefono,
                                @RequestParam("correo") String nuevoCorreo,
                                @RequestParam("sobre_mi") String nuevoInfo,
                                @RequestParam("url_img") String nuevoUrl_img){
        Persona p = iPersonaService.findPersona(id);
        p.setNombre(nuevoNombre);
        p.setApellido(nuevoApellido);
        p.setDomicilio(nuevoDom);
        p.setFecha_nac(nuevoFecha_nac);
        p.setTelefono(nuevoTelefono);
        p.setCorreo(nuevoCorreo);
        p.setSobre_mi(nuevoInfo);
        p.setUrl_img(nuevoUrl_img);
        
        iPersonaService.savePersonas(p);
        return p;
}
    
}
