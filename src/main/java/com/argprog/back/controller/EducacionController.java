package com.argprog.back.controller;

import com.argprog.back.model.Educacion;
import com.argprog.back.service.IEducacionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EducacionController {
    @Autowired
    private IEducacionService iEducacionService;
    
    @GetMapping("/educaciones/{id}")
    private List<Educacion> getEducaciones(@PathVariable Long id){
        return iEducacionService.findEducacionesPorPersona(id);
    }

}
