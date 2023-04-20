package com.example.helloworld.chambeaya.gasto;

import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.example.helloworld.chambeaya.gasto.model.Gasto;

@Primary
@Service
public class GastoServiceImpl implements GastoService {
  private GastoMapper gastoMapper;

  public GastoServiceImpl(GastoMapper gastoMapper) {
    this.gastoMapper = gastoMapper;

  }

  @Override
  public List<Gasto> getAllPays() {
    return gastoMapper.getAll();
  }

  @Override
  public Gasto getPayByid(int id) {
    return gastoMapper.getById(id);
  }

  @Override
  public void save(Gasto gasto) {
    int id = gasto.getId();
    Gasto encontrado = this.getPayByid(id);

    if (encontrado == null) {
      gastoMapper.insert(gasto);
    } else {
      gastoMapper.update(gasto);
    }
  }

  @Override
  public void kill(int id) {
    gastoMapper.delete(id);
  }

}