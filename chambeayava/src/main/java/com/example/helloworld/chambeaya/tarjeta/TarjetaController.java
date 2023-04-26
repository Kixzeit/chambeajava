package com.example.helloworld.chambeaya.tarjeta;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.helloworld.chambeaya.invoke.InvokeRemoteRestService;
import com.example.helloworld.chambeaya.invoke.JwtBody;
import com.example.helloworld.chambeaya.tarjeta.model.Tarjeta;


@RestController
@RequestMapping(value = "/api")
public class TarjetaController {
  private TarjetaService tarjetaService;
  private InvokeRemoteRestService invokeRemoteRestService;  

  public TarjetaController(TarjetaService tarjetaService,InvokeRemoteRestService invokeRemoteRestService) {
    this.tarjetaService = tarjetaService;
    this.invokeRemoteRestService = invokeRemoteRestService;
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
  public String borra(int id, @RequestHeader String jwt) {
    JwtBody resultado = invokeRemoteRestService.checkJwt(jwt);
    if (resultado.getUserId() < 0)
      return "{'resultado':false}".replace('\'', '\"');

    tarjetaService.kill(id);
    return "{'resultado':true}".replace('\'', '\"');
  }

  @PostMapping(value = "/update-cards", produces = "application/json; charset=utf-8")
  public String save(@RequestBody Tarjeta tarjeta, @RequestHeader String jwt) {
    JwtBody resultado = invokeRemoteRestService.checkJwt(jwt);
    if (resultado.getUserId() < 0) return "{'resultado':false}".replace('\'', '\"');

    tarjetaService.save(tarjeta);
    return "{'resultado':true}".replace('\'', '\"');
  }

}
