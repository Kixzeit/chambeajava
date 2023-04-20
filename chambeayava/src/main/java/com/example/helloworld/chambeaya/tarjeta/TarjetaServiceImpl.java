package com.example.helloworld.chambeaya.tarjeta;

import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.example.helloworld.chambeaya.tarjeta.model.Tarjeta;

@Primary
@Service
public class TarjetaServiceImpl implements TarjetaService {
  private TarjetaMapper tarjetaMapper;

  public TarjetaServiceImpl(TarjetaMapper tarjetaMapper) {
    this.tarjetaMapper = tarjetaMapper;

  }

  @Override
  public List<Tarjeta> getAllCards() {
    return tarjetaMapper.getAll();
  }

  @Override
  public Tarjeta getCardByid(int id) {
    return tarjetaMapper.getById(id);
  }

  @Override
  public void save(Tarjeta tarjeta) {
    int id = tarjeta.getId();
    Tarjeta encontrado = this.getCardByid(id);

    if (encontrado == null) {
      tarjetaMapper.insert(tarjeta);
    } else {
      tarjetaMapper.update(tarjeta);
    }
  }

  @Override
  public void kill(int id) {
    tarjetaMapper.delete(id);
  }

}