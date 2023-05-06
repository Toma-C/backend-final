package com.argprog.back.repository;

import com.argprog.back.model.Experiencia;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienciaRepository extends JpaRepository <Experiencia, Long>{
    @Query(value = "SELECT * FROM exp_laboral e WHERE e.personas_id = ?",nativeQuery = true)
    public List<Experiencia> findByPersona(Long personas_id);
}
