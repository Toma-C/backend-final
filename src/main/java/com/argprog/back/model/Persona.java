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
@Table(name="Personas")
public class Persona {
   @Id
   @GeneratedValue(strategy=GenerationType.SEQUENCE)
   private Long id;
   private String nombre;
   private String apellido;
   private String domicilio;
   private String fecha_nac;
   private String telefono;
   private String correo;
   private String sobre_mi;
   private String url_img;
}
