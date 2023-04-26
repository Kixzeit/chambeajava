package com.example.helloworld.chambeaya.Persona.model;

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

@RestController
@RequestMapping(value = "/api")
public class PersonaController {
  private PersonaService personaService;
  private InvokeRemoteRestService invokeRemoteRestService;
  
  public PersonaController(PersonaService personaService ,InvokeRemoteRestService invokeRemoteRestService) {
    this.personaService = personaService;
    this.invokeRemoteRestService = invokeRemoteRestService;
  }
  @GetMapping(value = "/get-persons", produces = "application/json; charset=utf-8")
  public List<Persona> listaTotal() {
    return this.personaService.getAllPersons();
  }

  @GetMapping(value = "/get-persons-byid", produces = "application/json; charset=utf-8")
  public Persona personaIndividual(@RequestParam int id) {
    return personaService.getPersonsByid(id);
  }

  @DeleteMapping(value = "/delete-persons-byid", produces = "application/json; charset=utf-8")
  public String borra(int id, @RequestHeader String jwt) {
    JwtBody resultado = invokeRemoteRestService.checkJwt(jwt);
    if (resultado.getUserId() < 0) return "{'resultado':false}".replace('\'', '\"');

    personaService.kill(id);
    return "{'resultado':true}".replace('\'', '\"');
  }
  
  @PostMapping(value = "/update-persons", produces = "application/json; charset=utf-8")
  public String save(@RequestBody Persona persona,
      @RequestHeader String jwt) {
        JwtBody resultado = invokeRemoteRestService.checkJwt(jwt);
    if (resultado.getUserId() < 0)
      return "{'resultado':false}".replace('\'', '\"');
    
    personaService.save(persona);
    return "{'resultado':true}".replace('\'', '\"');
  }

}

