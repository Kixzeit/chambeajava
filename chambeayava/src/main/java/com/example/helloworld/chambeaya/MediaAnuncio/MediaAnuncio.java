package com.example.helloworld.chambeaya.MediaAnuncio;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MediaAnuncio {
  private int id;
  private int idAnuncio;
  private String nombre;
  private Boolean activa;
}
