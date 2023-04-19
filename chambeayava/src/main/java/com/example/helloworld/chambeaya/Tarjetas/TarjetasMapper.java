package com.example.helloworld.chambeaya.Tarjetas;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface TarjetasMapper {
  @Select("SELECT * FROM Tarjetas")
  public List<Tarjetas> getAll();

  @Select("SELECT * FROM Tarjetas WHERE id = #{id} ")
  public Tarjetas getById(int id);

  @Insert("INSERT INTO Tarjetas VALUES(#{id},#{idUser},#{tipo},#{nombre},#{numeroTarjeta},#{mes},#{anio},#{cvv},#{icono})")
  public void insert(Tarjetas p);

  @Update("UPDATE Tarjetas SET  idUser#{id_user},tipo=#{tipo},nombre=#{nombre},numeroTarjeta=#{numero_tarjeta},mes=#{mes},anio=#{anio},cvv=#{cvv},icono=#{icono} WHERE id=#{id}")
  public void update(Tarjetas p);

  @Delete("DELETE FROM Tarjetas WHERE id=#{id}")
  public void delete(int id);
}
