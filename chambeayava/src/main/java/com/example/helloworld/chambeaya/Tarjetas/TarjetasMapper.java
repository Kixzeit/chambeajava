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

  @Insert("INSERT INTO Tarjetas VALUES(#{id},#{Id_usuario},#{icono},#{tipo_pago},#{numero_tarjeta})")
  public void insert(Tarjetas p);

  @Update("UPDATE Tarjetas SET  idUsuario=#{Id_usuario},icono=#{icono},tipoPago=#{tipo_pago},numeroTarjeta=#{numero_tarjeta}")
  public void update(Tarjetas p);

  @Delete("DELETE FROM Tarjetas WHERE id=#{idAnuncio}")
  public void delete(int idUSer);
}
