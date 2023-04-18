package com.example.helloworld.chambeaya.DatosPersonales;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DatosPersonales {
  private int idDatos;
  private String nombre;
  private String apPaterno;
  private String apMaterno;
  private String telefono;
  private String correo;
  private String fechaNacimiento;
  private String CodigoPostal;

}
