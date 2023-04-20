package com.example.helloworld.chambeaya.Persona.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Persona {
  private int id;
  private String nombre;
  private String apPaterno;
  private String apMaterno;
  private String telefono;
  private String correo;
  private String fechaNacimiento;
  private String estado;
  private String municipio;
  private String colonia;
  private String codigoPostal;
}
