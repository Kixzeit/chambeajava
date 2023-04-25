package com.example.helloworld.chambeaya.oficio;

import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class OficioServiceImpl implements OficioService {
  private OficioMapper oficioMapper;

  public OficioServiceImpl(OficioMapper oficioMapper) {
    this.oficioMapper= oficioMapper;

  }

  @Override
  public List<Oficio> getAllOficces() {
    return oficioMapper.getAll();
  }
  
}
