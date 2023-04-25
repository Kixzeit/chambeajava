package com.example.helloworld.chambeaya.tarjeta;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import com.example.helloworld.chambeaya.tarjeta.model.Tarjeta;

@Repository
public interface TarjetaMapper {
  @Results(id = "TarjetaMap", value = {
      @Result(property = "idUser", column = "id_user"),
  })
  @Select("SELECT * FROM tarjeta")
  public List<Tarjeta> getAll();

  @ResultMap("TarjetaMap")
  @Select("SELECT * FROM tarjeta")
  public List<Tarjeta> getAllById(int id);
  
  @ResultMap("TarjetaMap")
  @Select("SELECT * FROM tarjeta WHERE id_user=#{idUser}")
  public List<Tarjeta> getCardsById(int id);

  @Select("SELECT * FROM tarjeta WHERE id=#{id}")
  public Tarjeta getById(int id);

  @Insert("INSERT INTO tarjeta VALUES(#{id},#{idUser},#{tipo},#{nombre},#{numero},#{mes},#{anio},#{cvv},#{company})")
  public void insert(Tarjeta p);

  @Update("UPDATE tarjeta SET id_user=#{idUser},tipo=#{tipo},nombre=#{nombre},numero=#{numero},mes=#{mes},anio=#{anio},cvv=#{cvv},company=#{company} WHERE id=#{id}")
  public void update(Tarjeta p);

  @Delete("DELETE FROM tarjeta WHERE id=#{id}")
  public void delete(int id);
}



