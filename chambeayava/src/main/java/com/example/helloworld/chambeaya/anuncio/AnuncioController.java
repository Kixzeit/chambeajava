package com.example.helloworld.chambeaya.anuncio;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.helloworld.chambeaya.anuncio.model.Anuncio;
import com.example.helloworld.chambeaya.invoke.InvokeRemoteRestService;

@RestController
@RequestMapping(value = "/api")
public class AnuncioController {
  private AnuncioService anuncioService;
  private InvokeRemoteRestService invokeRemoteRestService;

  public AnuncioController(AnuncioService anuncioService,InvokeRemoteRestService invokeRemoteRestService) {
    this.anuncioService = anuncioService;
    this.invokeRemoteRestService = invokeRemoteRestService;
  }

  @GetMapping(value = "/get-ads", produces = "application/json; charset=utf-8")
  public List<Anuncio> listaTotal() {
    return this.anuncioService.getAllAds();
  }

  @GetMapping(value = "/get-ads-byid", produces = "application/json; charset=utf-8")
  public Anuncio anuncioIndividual(@RequestParam int id) {
    return anuncioService.getAdsByid(id);
  }

  @DeleteMapping(value = "/delete-ads-byid", produces = "application/json; charset=utf-8")
  public void borra(int id) {
    anuncioService.kill(id);
  }

  @PostMapping(value = "/update-ads", produces = "application/json; charset=utf-8")
  public String save(
      @RequestHeader String jwt,
      @RequestBody Anuncio anuncio) {
    String resultado = invokeRemoteRestService.checkJwt(jwt);
    if (resultado.length() < 50)
      return "{'resultado':false}".replace('\'', '\"');
    anuncioService.save(anuncio);
    return "{'resultado':true}".replace('\'', '\"');
  }
}


  

  // @GetMapping(value = "/dameProducto", produces = "application/json; charset=utf-8")
  // public ResultadoConsulta listaTotal(int id) {
  //   return this.productoService.getBigResult(id);
  // }

  // @GetMapping(value= "/get-ads-byid", produces = "application/json;
  // charset=utf-8")
  // public Anuncio

