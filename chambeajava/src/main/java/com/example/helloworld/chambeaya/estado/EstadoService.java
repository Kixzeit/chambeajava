package com.example.helloworld.chambeaya.estado;

import java.util.List;

public interface EstadoService {

  List<Estado> todos(int pais);

  Estado uno(int id);
}
