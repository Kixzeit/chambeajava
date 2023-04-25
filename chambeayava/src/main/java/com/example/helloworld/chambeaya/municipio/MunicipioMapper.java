package com.example.helloworld.chambeaya.municipio;

import java.util.List;
import org.apache.ibatis.annotations.Select;


public interface MunicipioMapper {

  @Select("SELECT * FROM municipios")
  public List<Municipio> getAll();

  @Select("SELECT * FROM municipios WHERE id = #{id} ")
  public Municipio getById(int id);

  @Select("SELECT * FROM municipios WHERE estado=#{estado}")
  public List<Municipio> getMuniByEstado(int estado);
}
