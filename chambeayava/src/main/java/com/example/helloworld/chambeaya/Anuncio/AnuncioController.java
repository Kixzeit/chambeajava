package com.example.helloworld.chambeaya.Anuncio;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.helloworld.chambeaya.Anuncio.model.ResultRequest;


@RestController
@RequestMapping(value = "/chambeajava")
public class AnuncioController {
  private AnuncioService anuncioService;

  @GetMapping(value = "/get-ads", produces = "application/json; charset=utf-8")
  public ResultRequest listaTotal(int id) {
    return this.anuncioService.getBigResult(id);
  }

  
}


