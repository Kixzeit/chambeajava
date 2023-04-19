package com.example.helloworld.chambeaya.Tarjetas;

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
  private int idUser;
  private String tipo;
  private String nombre;
  private String numeroTarjeta;
  private int mes;
  private int anio;
  private int cvv;
  private String icono;
}
// #{id},#{idUser},#{tipo},#{nombre},#{numeroTarjeta},#{mes},#{anio},#{cvv},#{icono}
// idUser#{id_user},tipo=#{tipo},nombre=#{nombre},numeroTarjeta=#{numero_tarjeta},mes=#{mes},anio=#{anio},cvv=#{cvv},icono=#{icono}

