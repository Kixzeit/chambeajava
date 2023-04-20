package com.example.helloworld.chambeaya.tarjeta;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import com.example.helloworld.chambeaya.tarjeta.model.Tarjeta;

@Repository
public interface TarjetaMapper {

  @Select("SELECT * FROM tarjeta")
  public List<Tarjeta> getAll();

  @Select("SELECT * FROM tarjeta WHERE id=#{id}")
  public Tarjeta getById(int id);

  @Insert("INSERT INTO tarjeta VALUES(#{id},#{tipo},#{nombre},#{numero},#{mes},#{anio},#{cvv})")
  public void insert(Tarjeta p);

  @Update("UPDATE tarjeta SET tipo=#{tipo},nombre=#{nombre},numero=#{numero},mes=#{mes},anio=#{anio},cvv=#{cvv} WHERE id=#{id}")
  public void update(Tarjeta p);

  @Delete("DELETE FROM tarjeta WHERE id=#{id}")
  public void delete(int id);
}



