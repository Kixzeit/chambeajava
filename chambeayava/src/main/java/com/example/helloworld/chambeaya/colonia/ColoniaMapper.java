package com.example.helloworld.chambeaya.colonia;

import java.util.List;

import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Select;

public interface ColoniaMapper {
  @Results(id = "ColoniaMap", value = {
  @Result(property = "codigoPostal", column = "codigo_postal")
  })
  @Select("SELECT * FROM colonias WHERE codigo_postal=#{codigoPostal}")
  public List<Colonia>getColonies(int CodigoPostal);
}
