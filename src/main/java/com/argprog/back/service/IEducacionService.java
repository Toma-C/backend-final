
package com.argprog.back.service;

import com.argprog.back.model.Educacion;
import java.util.List;

public interface IEducacionService {
    public List<Educacion> getEducaciones();
    public void saveEducacion(Educacion e);
    public void deleteEducacion(Long id);
    public Educacion findEducacion(Long id);
    public List<Educacion> findEducacionesPorPersona(Long personas_id);
}