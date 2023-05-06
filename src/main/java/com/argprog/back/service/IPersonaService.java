
package com.argprog.back.service;

import com.argprog.back.model.Persona;
import java.util.List;

public interface IPersonaService {
    public List<Persona> getPersonas();
    public void savePersonas(Persona p);
    public void deletePersona(Long id);
    public Persona findPersona(Long id);
}
