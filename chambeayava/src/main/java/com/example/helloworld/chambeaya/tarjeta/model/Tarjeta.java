package com.example.helloworld.chambeaya.tarjeta.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Tarjeta {
  private int id;
  private String tipo;
  private String nombre;
  private String numero;
  private String mes;
  private String anio;
  private String cvv;
}





