package com.example.helloworld.chambeaya.anuncio;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.helloworld.chambeaya.anuncio.model.Anuncio;
import com.example.helloworld.chambeaya.invoke.InvokeRemoteRestService;
import com.example.helloworld.chambeaya.invoke.JwtBody;

@RestController
@RequestMapping(value = "/api")
public class AnuncioController {
  private AnuncioService anuncioService;
  private InvokeRemoteRestService invokeRemoteRestService;

  public AnuncioController(AnuncioService anuncioService, InvokeRemoteRestService invokeRemoteRestService) {
    this.anuncioService = anuncioService;
    this.invokeRemoteRestService = invokeRemoteRestService;
  }

  @GetMapping(value = "/get-ads", produces = "application/json; charset=utf-8")
  public List<Anuncio> listaTotal() {
    return this.anuncioService.getAllAds();
  }

  @GetMapping(value = "/get-allads-byoficce/{oficio}", produces = "application/json; charset=utf-8")
  public List<Anuncio> listaTotalPorOficio(@PathVariable String oficio) {
    return this.anuncioService.getAllAdsByOficce(oficio);
  }

  @GetMapping(value = "/get-ads-byid/{id}", produces = "application/json; charset=utf-8")
  public Anuncio anuncioIndividual(@PathVariable int id) {
    return anuncioService.getAdsByid(id);
  }

  @DeleteMapping(value = "/delete-ads-byid", produces = "application/json; charset=utf-8")
  public String borra(
      @RequestHeader String jwt,
      int id) {
    JwtBody resultado = invokeRemoteRestService.checkJwt(jwt);
    if (resultado.getUserId() < 0)
      return "{'resultado':false}".replace('\'', '\"');
    anuncioService.kill(id);
    return "{'resultado':true}".replace('\'', '\"');
  }

  @PostMapping(value = "/update-ads", produces = "application/json; charset=utf-8")
  public String save(
      @RequestHeader int idUser,
      @RequestHeader String jwt,
      @RequestBody Anuncio anuncio) {
    JwtBody resultado = invokeRemoteRestService.checkJwt(jwt);
    if (resultado.getUserId() < 0)
      return "{'resultado':false}".replace('\'', '\"');

    anuncioService.save(anuncio);
    return "{'resultado':true}".replace('\'', '\"');
  }
  
  @GetMapping(value = "/get-url-img", produces = "application/json; charset=utf-8")
  public List<String> urlsImagenesUsusariosController(@RequestBody List<Anuncio> anuncios) {
    return anuncios.stream().map(p -> this.invokeRemoteRestService.profileImage(p.getId())).collect(Collectors.toList());
  }

  





}
