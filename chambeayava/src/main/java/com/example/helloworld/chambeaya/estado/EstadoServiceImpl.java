package com.example.helloworld.chambeaya.estado;


import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service

public class EstadoServiceImpl implements EstadoService {
  private EstadoMapper estadoMapper;

  public EstadoServiceImpl(EstadoMapper estadoMapper) {
    this.estadoMapper = estadoMapper;

  }

  @Override
  public List<Estado> todos(int pais) {
    return estadoMapper.getAll();
  }

  @Override
  public Estado uno(int id) {
    return estadoMapper.getById(id);
  }
}