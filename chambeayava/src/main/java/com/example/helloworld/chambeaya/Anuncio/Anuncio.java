package com.example.helloworld.chambeaya.Anuncio;

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
  private int idAnuncio;
  private int idUser;
  private String descripcionPequeña;
  private String descripcionCompleta;
  private String codigoPostal;
  private String oficio;
  private String telefonoNegocio;
  private String correoNegocio;
  private String nick;
}
