package com.example.helloworld.chambeaya.Ine;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Ine {
  private int id;
  private int idUser;
  private String nombre;
  private boolean identificacion;
  private Boolean activa;
}
