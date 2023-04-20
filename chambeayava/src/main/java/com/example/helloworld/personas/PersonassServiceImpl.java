package com.example.helloworld.personas;

import java.util.List;
import org.springframework.stereotype.Service;

@Service(value = "primeraImplementacion")
public class PersonassServiceImpl implements PersonassService {
    private PersonassMapper personaMapper;
    
    public PersonassServiceImpl(PersonassMapper personaMapper) {
        this.personaMapper = personaMapper;
    }
    public Personass calcula(String ua, String col, String v1, String v2, String v3) {
        return personaMapper.getById(7534);
    }
    @Override
    public List<Personass> getAll() {
        return personaMapper.getAll();
    }
}
