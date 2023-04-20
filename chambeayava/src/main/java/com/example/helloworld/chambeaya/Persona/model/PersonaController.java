package com.example.helloworld.chambeaya.Persona.model;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class PersonaController {
  private PersonaService personaService;
  
  public PersonaController(PersonaService personaService) {
    this.personaService = personaService;
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
  public void borra(int id) {
    personaService.kill(id);
  }

  @PostMapping(value = "/update-persons", produces = "application/json; charset=utf-8")
  public void save(@RequestBody Persona persona) {
    personaService.save(persona);
  }

}

