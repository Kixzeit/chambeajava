package com.example.helloworld.chambeaya.colonia;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Colonia {
  private int id;
  private String nombre;
  private String ciudad;
  private int municipio;
  private String asentamiento;
  private int codigoPostal;
}
