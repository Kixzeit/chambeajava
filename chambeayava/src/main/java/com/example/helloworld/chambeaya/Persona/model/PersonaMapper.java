package com.example.helloworld.chambeaya.Persona.model;

import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaMapper {
  @Results(id = "PersonaMap", value = {
      @Result(property = "apPaterno", column = "ap_paterno"),
      @Result(property = "apMaterno", column = "ap_materno"),
      @Result(property = "fechaNacimiento", column = "fecha_nacimiento"),
      @Result(property = "codigoPostal", column = "codigo_postal")
  })
  @Select("SELECT * FROM persona")
  public List<Persona> getAllPersons();

  @ResultMap("PersonaMap")
  @Select("SELECT * FROM persona WHERE id=#{id}")
  public Persona getById(int id);

  @Insert("INSERT INTO persona VALUES(#{id},#{nombre},#{apPaterno},#{apMaterno},#{telefono},#{correo},#{fechaNacimiento},#{estado},#{municipio},#{colonia},#{codigoPostal})")
  public void insert(Persona p);

  @Update("UPDATE persona SET nombre=#{nombre},ap_paterno=#{apPaterno},ap_materno=#{apMaterno},telefono=#{telefono},correo=#{correo},fecha_nacimiento=#{fechaNacimiento},estado=#{estado},municipio=#{municipio},colonia=#{colonia},codigo_postal=#{codigoPostal} WHERE id=#{id}")
  public void update(Persona p);

  @Delete("DELETE FROM persona WHERE id=#{id}")
  public void delete(int id);
}
