package com.example.helloworld.chambeaya.Oficio;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Oficio {
  private int id;
  private String nombre;
  private String apPaterno;
  private String apMaterno;
  private String telefono;
  private String correo;
  private String fechaNacimiento;
  private String estado;
  private String municpio;
  private String colonia;
  private String codigoPostal;
  private String imagenPrincipal;
}
