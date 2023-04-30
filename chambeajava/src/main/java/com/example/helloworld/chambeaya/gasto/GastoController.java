package com.example.helloworld.chambeaya.gasto;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.helloworld.chambeaya.gasto.model.Gasto;

@RestController
@RequestMapping(value = "/api")
public class GastoController {
  private GastoService gastoService;

  public GastoController(GastoService gastoService) {
    this.gastoService = gastoService;
  }

  @GetMapping(value = "/get-pays", produces = "application/json; charset=utf-8")
  public List<Gasto> listaTotal() {
    return this.gastoService.getAllPays();
  }

  @GetMapping(value = "/get-allpays-byid/{id}", produces = "application/json; charset=utf-8")
  public List<Gasto> listaTotalPorId(@PathVariable int id) {
    return this.gastoService.getAllPaysByid(id);
  }

  @GetMapping(value = "/get-pays-byid", produces = "application/json; charset=utf-8")
  public Gasto gastoIndividual(@RequestParam int id) {
    return gastoService.getPayByid(id);
  }

  @DeleteMapping(value = "/delete-pays-byid", produces = "application/json; charset=utf-8")
  public void borra(int id) {
    gastoService.kill(id);
  }

  @PostMapping(value = "/update-pays", produces = "application/json; charset=utf-8")
  public void save(@RequestBody Gasto gasto) {
    gastoService.save(gasto);
  }
}