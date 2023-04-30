package com.example.helloworld.chambeaya.estado;

import java.util.List;
import org.apache.ibatis.annotations.Select;


public interface EstadoMapper {

  @Select("SELECT * FROM estados")
  public List<Estado> getAll();

  @Select("SELECT * FROM estados WHERE id = #{id} ")
  public Estado getById(int id);

  @Select("SELECT * FROM estados WHERE pais=#{pais}")
  public List<Estado> todos(int pais);
}