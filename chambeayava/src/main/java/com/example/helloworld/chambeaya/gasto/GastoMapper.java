package com.example.helloworld.chambeaya.gasto;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import com.example.helloworld.chambeaya.gasto.model.Gasto;



@Repository
public interface GastoMapper{

  @Select("SELECT * FROM gasto")
  public List<Gasto> getAll();

  @Select("SELECT * FROM gasto WHERE id=#{id}")
  public Gasto getById(int id);

  @Insert("INSERT INTO gasto VALUES(#{id},#{idUser},#{dia},#{monto})")
  public void insert(Gasto p);

  @Update("UPDATE gasto SET id_user=#idUser,dia=#{dia},monto=#{monto} WHERE id=#{id}")
  public void update(Gasto p);

  @Delete("DELETE FROM gasto WHERE id=#{id}")
  public void delete(int id);
}
