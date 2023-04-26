package com.example.helloworld.chambeaya.colonia;

import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class ColoniaServiceImpl implements ColoniaService {
  private ColoniaMapper coloniaMapper;

  public ColoniaServiceImpl(ColoniaMapper coloniaMapper){
    this.coloniaMapper = coloniaMapper;
  }

  @Override
  public List<Colonia> getAllColonies(int codigoPostal) {
    return coloniaMapper.getColonies(codigoPostal);
  }

}


