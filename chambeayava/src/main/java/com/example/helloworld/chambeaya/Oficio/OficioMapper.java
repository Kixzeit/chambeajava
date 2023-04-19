package com.example.helloworld.chambeaya.Oficio;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface OficioMapper {
  @Select("SELECT * FROM Oficio")
  public List<Oficio> getAll();

  @Select("SELECT * FROM Oficio WHERE id = #{id} ")
  public Oficio getById(int id);

  @Insert("INSERT INTO Oficio VALUES(#{id},#{idDatos},#{nombre},#{apPaterno},#{apMaterno},#{telefono},#{correo},#{fechaNacimiento},#{estado},#{municpio},#{colonia},#{codigoPostal},#{imagenPrincipal})")
  public void insert(Oficio p);

  @Update("UPDATE Oficio SET  id_datos=#{idDatos},nombre=#{nombre},ap_paterno=#{apPaterno},ap_materno=#{apMaterno},telefono=#{telefono},correo=#{correo},fecha_nacimiento=#{fechaNacimiento},estado=#{estado},municipio=#{municpio},colonia=#{colonia},codigo_postal=#{codigoPostal},imagen_principal={imagenPrincipal} WHERE id=#{id}")
  public void update(Oficio p);

  @Delete("DELETE FROM Oficio WHERE id=#{id}")
  public void delete(int id);
}
