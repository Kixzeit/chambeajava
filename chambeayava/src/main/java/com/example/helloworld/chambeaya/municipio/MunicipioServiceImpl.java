package com.example.helloworld.chambeaya.municipio;

import java.util.List;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service

public class MunicipioServiceImpl implements MunicipioService {
  private MunicipioMapper municipioMapper;

  public MunicipioServiceImpl(MunicipioMapper municipioMapper) {
    this.municipioMapper = municipioMapper;
  }

  @Override
  public List<Municipio> getAllMuni(int estado) {
    return municipioMapper.getMuniByEstado(estado);
  }

}
