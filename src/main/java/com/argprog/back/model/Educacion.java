
package com.argprog.back.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name="Educacion")
public class Educacion {
   @Id
   @GeneratedValue(strategy=GenerationType.SEQUENCE)
   private Long id;
   private String nivel;
   private String instituto;
   private String fecha_inicio;
   private String fecha_fin;
   private String titulo;
   private Long personas_id;
}
