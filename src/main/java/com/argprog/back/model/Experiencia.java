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
@Table(name="exp_laboral")
public class Experiencia {
   @Id
   @GeneratedValue(strategy=GenerationType.SEQUENCE)
   private Long id;
   private String empresa;
   private String tipo_exp;
   private String desc;
   private String fecha_inicio;
   private String fecha_fin;
   private Long personas_id;
}
