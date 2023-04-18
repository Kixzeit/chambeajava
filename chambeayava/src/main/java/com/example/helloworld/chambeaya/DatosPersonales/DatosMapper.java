package com.example.helloworld.chambeaya.DatosPersonales;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface DatosMapper {
  @Select("SELECT * FROM DatosPersonales")
  public List<DatosPersonales> getAll();

  @Select("SELECT * FROM DatosPersonales WHERE id = #{id} ")
  public DatosPersonales getById(int id);

  @Insert("INSERT INTO DatosPersonales VALUES(#{id},#{idDatos},#{nombre},#{apPaterno},#{apMaterno},#{telefono},#{correo},#{fechaNacimiento},#{codigoPostal})")
  public void insert(DatosPersonales p);

  @Update("UPDATE DatosPersonales SET  idDatos=#{idDatos},nombre=#{nombre},apPaterno=#{apPaterno},apMaterno=#{apMaterno},telefono=#{telefono},correo=#{correo},fechaNacimiento=#{fechaNacimiento},codigoPostal=#{codigoPostal}")
  public void update(DatosPersonales p);

  @Delete("DELETE FROM DatosPersonales WHERE id=#{idUser}")
  public void delete(int idUSer);
}

// INSERT INTO`chambeaya`.`Datos_Personales`(`Id_Datos`,`Nombre`,`Ap_Paterno`,
// `Ap_Materno`,`Telefono`,`Correo`,`Fecha_Nacimiento`,`Codigo_Postal`)
//  VALUES ('2', 'asdf', 'asdf', 'asdf', 'asdf', 'asdf', 'asdf', 'asdf');

// #{id},#{idDatos},#{nombre},#{apPaterno},#{apMaterno},#{telefono},#{correo},#{fechaNacimiento},#{codigoPostal}#{},#{},#{},#{}
// idDatos=#{idDatos},nombre=#{nombre},apPaterno=#{apPaterno},apMaterno=#{apMaterno},telefono=#{telefono},correo=#{correo},fechaNacimiento=#{fechaNacimiento},codigoPostal=#{codigoPostal}