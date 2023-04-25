package com.example.helloworld.chambeaya.oficio;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping(value = "/api")
public class OficioController {
  private OficioService oficioService;

  public OficioController(OficioService oficioService) {
    this.oficioService = oficioService;
  }

  @GetMapping(value = "/get-oficces", produces = "application/json; charset=utf-8")
  public List<Oficio> listaTotal() {
    return this.oficioService.getAllOficces();
  }

}
