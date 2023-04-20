package com.example.helloworld.chambeaya.Anuncio;

import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.example.helloworld.chambeaya.Anuncio.model.Anuncio;



@Primary
@Service
public class AnuncioServiceImpl implements AnuncioService {
private AnuncioMapper anuncioMapper;

public AnuncioServiceImpl(AnuncioMapper anuncioMapper) {
this.anuncioMapper = anuncioMapper;

}

@Override
public List<Anuncio> getAllAds() {
return anuncioMapper.getAll();
}

@Override
public Anuncio getAdsByid(int id) {
  return anuncioMapper.getById(id);
}

@Override
public void save(Anuncio anuncio) {
  int id = anuncio.getId();
  Anuncio encontrado = this.getAdsByid(id);

  if (encontrado == null) {
    anuncioMapper.insert(anuncio);
  } else {
    anuncioMapper.update(anuncio);
  }
}

@Override
public void kill(int id) {
  anuncioMapper.delete(id);
}

}
