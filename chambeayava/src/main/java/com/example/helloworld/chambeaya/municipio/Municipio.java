package com.example.helloworld.chambeaya.municipio;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Municipio {
  private int id;
  private String nombre;
  private int estado;
}