package com.example.helloworld.chambeaya.municipio;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class MunicipioController {
  private MunicipioService municipioService;

  public MunicipioController(MunicipioService municipioService) {
    this.municipioService = municipioService;
  }

  @GetMapping(value = "/obten-municipios", produces = "application/json; charset=utf-8")
  public List<Municipio> listaTotalPorEstado(@RequestParam int estado) {
    return this.municipioService.getAllMuni(estado);
  }

}