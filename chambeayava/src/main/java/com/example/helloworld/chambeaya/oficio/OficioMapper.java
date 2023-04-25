package com.example.helloworld.chambeaya.oficio;

import java.util.List;

import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Result;

import org.apache.ibatis.annotations.Select;

import org.springframework.stereotype.Repository;


@Repository
public interface OficioMapper {
  @Results(id = "OficioMap", value = {
      @Result(property = "idOficio", column = "id_oficio"),
  })
  @Select("SELECT * FROM oficio")
  public List<Oficio> getAll();

}
