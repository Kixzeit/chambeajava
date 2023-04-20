package com.example.helloworld.personas;

import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service(value = "primeraImplementacionYYY")
public class PersonassServiceImpl2 implements PersonassService {
    private PersonassMapper personaMapper;
    
    public PersonassServiceImpl2(PersonassMapper personaMapper) {
        this.personaMapper = personaMapper;
    }
    
    public Personass calcula(String ua, String col, String v1, String v2, String v3) {
        Personass p = personaMapper.getById(2233);
        float nuevo = 2*p.getSueldo();
        if(nuevo>150) {
            p.setNombre("super adinerado");
        } else {
            p.setApPat("muy pobre");
        }
        p.setSueldo(nuevo);
        personaMapper.insert(p);
        return p;
    }
    @Override
    public List<Personass> getAll() {
        return personaMapper.getAll();
    }

}
