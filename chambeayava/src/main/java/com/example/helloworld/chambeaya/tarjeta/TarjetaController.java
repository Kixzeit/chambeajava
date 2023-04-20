package com.example.helloworld.chambeaya.tarjeta;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.helloworld.chambeaya.tarjeta.model.Tarjeta;


@RestController
@RequestMapping(value = "/api")
public class TarjetaController {
  private TarjetaService tarjetaService;

  public TarjetaController(TarjetaService tarjetaService) {
    this.tarjetaService = tarjetaService;
  }

  @GetMapping(value = "/get-cards", produces = "application/json; charset=utf-8")
  public List<Tarjeta> listaTotal() {
    return this.tarjetaService.getAllCards();
  }

  @GetMapping(value = "/get-allcards-byid", produces = "application/json; charset=utf-8")
  public List<Tarjeta> listaTotalPorId(@RequestParam int id) {
    return this.tarjetaService.getAllCardsByid(id);
  }

  @GetMapping(value = "/get-cards-byid", produces = "application/json; charset=utf-8")
  public Tarjeta tarjetaIndividual(@RequestParam int id) {
    return tarjetaService.getCardByid(id);
  }

  @DeleteMapping(value = "/delete-cards-byid", produces = "application/json; charset=utf-8")
  public void borra(int id) {
    tarjetaService.kill(id);
  }

  @PostMapping(value = "/update-cards", produces = "application/json; charset=utf-8")
  public void save(@RequestBody Tarjeta tarjeta) {
    tarjetaService.save(tarjeta);
  }

}