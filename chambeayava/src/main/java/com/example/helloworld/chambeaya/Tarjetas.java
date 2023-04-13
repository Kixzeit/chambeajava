package com.example.helloworld.chambeaya;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Tarjetas {
  private int id;
  private int idUsuario;
  private String icono;
  private String tipoPago;
  private String NumeroTarjeta;
}
