package com.example.helloworld.chambeaya.anuncio;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import com.example.helloworld.chambeaya.anuncio.model.Anuncio;



@Repository
public interface AnuncioMapper {
@Results(id = "AnuncioMap", value = {
@Result(property = "idUser", column = "id_user"),
@Result(property = "nombreNegocio", column = "nombre_negocio"),
@Result(property = "descripcionPequeña", column = "descripcion_pequeña"),
@Result(property = "descripcionCompleta", column = "descripcion_completa"),
@Result(property = "codigoPostal", column = "codigo_postal"),
@Result(property = "telefonoNegocio", column = "telefono_negocio"),
@Result(property = "correoNegocio", column = "correo_negocio")
})
@Select("SELECT * FROM anuncio")
public List<Anuncio> getAll();

@ResultMap("AnuncioMap")
@Select("SELECT * FROM anuncio WHERE id=#{id}")
public Anuncio getById(int id);

@Insert("INSERT INTO anuncio VALUES(#{id},#{idUser},#{nombreNegocio},#{descripcionPequeña},#{descripcionCompleta},#{codigoPostal},#{oficio},#{telefonoNegocio},#{correoNegocio})")
public void insert(Anuncio p);

@Update("UPDATE anuncio SET id_user=#{idUser},nombre_negocio=#{nombreNegocio},descripcion_pequeña=#{descripcionPequeña},descripcion_completa=#{descripcionCompleta},codigo_postal=#{codigoPostal},oficio=#{oficio},telefono_negocio=#{telefonoNegocio},correo_negocio=#{correoNegocio} WHERE id=#{id}")
public void update(Anuncio p);

@Delete("DELETE FROM anuncio WHERE id=#{id}")
public void delete(int id);

@ResultMap("AnuncioMap")
@Select("SELECT * FROM anuncio WHERE oficio=#{oficio}")
public List<Anuncio> getAdsByOficce(String oficio);
}
