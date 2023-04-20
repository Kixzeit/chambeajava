package com.example.helloworld.chambeaya.Anuncio;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.helloworld.chambeaya.Anuncio.model.Anuncio;


//import com.example.helloworld.anuncio.model.ResultRequest;



@RestController
@RequestMapping(value = "/api")
public class AnuncioController {
  private AnuncioService anuncioService;

  public AnuncioController(AnuncioService anuncioService) {
    this.anuncioService = anuncioService;
  }

  @GetMapping(value = "/get-ads", produces = "application/json; charset=utf-8")
  public List<Anuncio> listaTotal() {
    return this.anuncioService.getAllAds();
  }

  @GetMapping(value = "/get-ads-byid", produces = "application/json; charset=utf-8")
  public Anuncio AnuncioIndividual(@RequestParam int id) {
    return anuncioService.getAdsByid(id);
  }

  @DeleteMapping(value = "/delete-ads-byid", produces = "application/json; charset=utf-8")
  public void borra(int id) {
    anuncioService.kill(id);
  }

  @PostMapping(value = "/update-ads", produces = "application/json; charset=utf-8")
  public void save(Anuncio anuncio) {
    anuncioService.save(anuncio);
  }
  
}

// public ProductoController(ProductoService productoService, LoginService loginService) {
//         this.productoService = productoService;
//         this.loginService = loginService;
//     }

  

  // @GetMapping(value = "/dameProducto", produces = "application/json; charset=utf-8")
  // public ResultadoConsulta listaTotal(int id) {
  //   return this.productoService.getBigResult(id);
  // }

  // @GetMapping(value= "/get-ads-byid", produces = "application/json;
  // charset=utf-8")
  // public Anuncio

