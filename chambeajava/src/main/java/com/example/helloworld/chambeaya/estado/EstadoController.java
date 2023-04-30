package com.example.helloworld.chambeaya.estado;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class EstadoController {
  private EstadoService estadoService;

  public EstadoController(EstadoService estadoService) {
    this.estadoService = estadoService;
  }

  @GetMapping(value = "/obten-estados", produces = "application/json; charset=utf-8")
  public List<Estado> todos(@RequestParam int pais) {
    return this.estadoService.todos(pais);
  }

  @GetMapping(value = "/obten-estado", produces = "application/json; charset=utf-8")
  public Estado uno(@RequestParam int id) {
    return estadoService.uno(id);
  }

}