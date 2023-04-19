package com.example.helloworld.chambeaya.Anuncio.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Anuncio {
  private int id;
  private int idUser;
  private int nombreNegocio;
  private String descripcionPequeña;
  private String descripcionCompleta;
  private String codigoPostal;
  private String oficio;
  private String telefonoNegocio;
  private String correoNegocio;
  private String nickname;
}
