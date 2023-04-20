package com.example.helloworld.chambeaya.Persona.model;

import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PersonaServiceImpl implements PersonaService {
  private PersonaMapper personaMapper;

  public PersonaServiceImpl(PersonaMapper personaMapper) {
    this.personaMapper = personaMapper;
  }
  @Override
  public List<Persona> getAllPersons() {
    return personaMapper.getAllPersons();
  }

  @Override
  public Persona getPersonsByid(int id) {
    return personaMapper.getById(id);
  }

  @Override
  public void save(Persona persona) {
    int id = persona.getId();
    Persona encontrado = this.getPersonsByid(id);

    if (encontrado == null) {
      personaMapper.insert(persona);
    } else {
      personaMapper.update(persona);
    }
  }

  @Override
  public void kill(int id) {
    personaMapper.delete(id);
  }

}
