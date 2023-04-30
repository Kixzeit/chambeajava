package com.example.helloworld.chambeaya.estado;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Estado {
  private int id;
  private String nombre;
  private int pais;
}
