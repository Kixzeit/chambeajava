package com.example.helloworld.chambeaya.MediaAnuncio;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface MediaAnuncioMapper {
  @Select("SELECT * FROM MediaAnuncio")
  public List<MediaAnuncio> getAll();

  @Select("SELECT * FROM MediaAnuncio WHERE id = #{id} ")
  public MediaAnuncio getById(int id);

  @Insert("INSERT INTO MediaAnuncio VALUES(#{id},#{Id_Anuncio},#{Nombre},#{Activa})")
  public void insert(MediaAnuncio p);

  @Update("UPDATE MediaAnuncio SET  idAnuncio=#{Id_Anuncio},nombre=#{nombre},activa=#{Activa}")
  public void update(MediaAnuncio p);

  @Delete("DELETE FROM MediaAnuncio WHERE id=#{idAnuncio}")
  public void delete(int idUSer);
}
