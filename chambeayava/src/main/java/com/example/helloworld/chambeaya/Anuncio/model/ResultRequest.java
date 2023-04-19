package com.example.helloworld.chambeaya.Anuncio.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class ResultRequest {
  private Anuncio anuncio;
  private List<String> imagenes;
  private List<String> videos;
  private List<String> anuncios;
  private List<String> tarjetas;
  private List<String> credenciales;

}
