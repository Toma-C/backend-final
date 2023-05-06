package com.argprog.back.model;

import com.argprog.back.service.EducacionService;
import com.argprog.back.service.ExperienciaService;
import com.argprog.back.service.IEducacionService;
import com.argprog.back.service.IExperienciaService;
import com.argprog.back.service.IPersonaService;
import com.argprog.back.service.PersonaService;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

@Getter
@Setter
public class Datos{
    private Persona persona;
    private List<Experiencia> experiencias;
    private List<Educacion> educaciones;
}
