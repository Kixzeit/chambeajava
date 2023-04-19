package com.example.helloworld.chambeaya.Anuncio;

import java.util.List;

import com.example.helloworld.chambeaya.Anuncio.model.Anuncio;
import com.example.helloworld.chambeaya.Anuncio.model.ResultRequest;

public class AnuncioServiceImpl implements AnuncioService {
  private AnuncioMapper adsMapper;

  public AnuncioServiceImpl(AnuncioMapper adsMapper) {
    this.adsMapper = adsMapper;
  }

  @Override
  public List<Anuncio> getAllAds() {
    return adsMapper.getAll();
  }

  @Override
  public Anuncio getAdsById(int id) {
    return adsMapper.getById(id);
  }

  @Override
  public void save(Anuncio anuncio) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'save'");
  }

  @Override
  public void delete(Anuncio anuncio) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'delete'");
  }

  @Override
  public ResultRequest getBigResult(int id) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getBigResult'");
  }
  
}
