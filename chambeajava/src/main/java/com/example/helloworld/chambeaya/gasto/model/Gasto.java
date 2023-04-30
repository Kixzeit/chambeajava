package com.example.helloworld.chambeaya.gasto.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Gasto {
  private int id;
  private int idUser;
  private String dia;
  private double monto;
}
// #{id},#{idUser},#{dia},#{monto},

// =#{id},=#idUser{dia},=#{monto},