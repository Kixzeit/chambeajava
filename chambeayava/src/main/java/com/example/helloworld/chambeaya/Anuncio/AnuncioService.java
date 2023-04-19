package com.example.helloworld.chambeaya.Anuncio;

import java.util.List;

import com.example.helloworld.chambeaya.Anuncio.model.Anuncio;
import com.example.helloworld.chambeaya.Anuncio.model.ResultRequest;

public interface AnuncioService {
  /*
   * Regresa todos los productos guardados en la base de datos.
   * 
   *
   */
  List<Anuncio> getAllAds();

  Anuncio getAdsById(int id);

  void save(Anuncio anuncio);

  void delete(Anuncio anuncio);

  ResultRequest getBigResult(int id);
}
