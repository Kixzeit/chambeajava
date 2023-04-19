package com.example.helloworld.chambeaya.Anuncio;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import com.example.helloworld.chambeaya.Anuncio.model.Anuncio;

@Repository
public interface AnuncioMapper {
  @Results(id = "AnuncioMap", value = {
      @Result(property = "idUser", column = "id_user"),
      @Result(property = "nombreNegocio", column = "nombre_negocio"),
      @Result(property = "descripcionPequeña", column = "descipcion_pequeña"),
      @Result(property = "descripcionCompleta", column = "descripcion_completa"),
      @Result(property = "codigoPostal", column = "codigo_postal"),
      @Result(property = "telefonoNegocio", column = "telefono_negocio"),
      @Result(property = "correoNegocio", column = "correo_negocio")
  })
  @Select("SELECT * FROM chambeaya")
  public List<Anuncio> getAll();

  @ResultMap("AnucioMap")
  @Select("SELECT * FROM Anuncio WHERE id = #{id} ")
  public Anuncio getById(int id);

  @Insert("INSERT INTO Anuncio VALUES(#{id},#{idUser},#{nombreNegocio},#{descripcionPequeña},#{descripcionCompleta},#{codigoPostal},#{oficio},#{telefonoNegocio},#{correoNegocio}#{nickname})")
  public void insert(Anuncio p);

  @Update("UPDATE Anuncio SET  id_user=#{id_user},nombre_negocio=#{nombre_negocio},descripcion_pequeña=#{descripcion_pequeña},descripcion_completa=#{descripcion_completa},codigo_postal=#{codigo_postal},oficio=#{oficio},telefono_negocio=#{telefono_negocio},correo_negocio=#{correo_negocio}nickname=#{nickname} WHERE id=#{id}")
  public void update(Anuncio p);

  @Delete("DELETE FROM Anuncio WHERE id=#{id}")
  public void delete(int idUSer);
}
