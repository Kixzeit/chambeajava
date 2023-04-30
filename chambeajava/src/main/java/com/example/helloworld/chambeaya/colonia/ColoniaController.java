package com.example.helloworld.chambeaya.colonia;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class ColoniaController {
  private ColoniaService coloniaService;
  

  public ColoniaController(ColoniaService coloniaService) {
    this.coloniaService = coloniaService;
  }

  @GetMapping(value = "/get-all-colonies/{codigoPostal}", produces = "application/json; charset=utf-8")
  public List<Colonia> listaTotalPorCodigo(@PathVariable int codigoPostal) {
    return this.coloniaService.getAllColonies(codigoPostal);
  }

}
