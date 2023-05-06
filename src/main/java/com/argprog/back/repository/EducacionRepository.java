
package com.argprog.back.repository;

import com.argprog.back.model.Educacion;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EducacionRepository extends JpaRepository <Educacion, Long>{
    @Query(value = "SELECT * FROM educacion e WHERE e.personas_id = ?",nativeQuery = true)
    public List<Educacion> findByPersona(Long personas_id);
}
