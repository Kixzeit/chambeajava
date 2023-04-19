package com.example.helloworld.chambeaya.MediaAnuncio;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface MediaAnuncioMapper {
  @Select("SELECT * FROM media_anuncio")
  public List<MediaAnuncio> getAll();

  @Select("SELECT * FROM media_anuncio WHERE id = #{id} ")
  public MediaAnuncio getById(int id);

  @Insert("INSERT INTO media_anuncio VALUES(#{id},#{IdUSer},#{nombre},#{activa},#{tipo})")
  public void insert(MediaAnuncio p);

  @Update("UPDATE media_anuncio SET  id_user=#{id_user},nombre=#{nombre},activa=#{activa},tipo={tipo} WHERE id = #{id}")
  public void update(MediaAnuncio p);

  @Delete("DELETE FROM media_anuncio WHERE id=#{id}")
  public void delete(int id);
}
