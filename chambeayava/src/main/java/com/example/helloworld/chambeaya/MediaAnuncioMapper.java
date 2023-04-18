package com.example.helloworld.chambeaya;

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

  @Insert("INSERT INTO MediaAnuncio VALUES(#{id},#{idUser},#{nombre})")
  public void insert(MediaAnuncio p);

  @Update("UPDATE MediaAnuncio SET  idUser=#{idUser}, nombre=#{nombre} WHERE id=#{id}")
  public void update(MediaAnuncio p);

  @Delete("DELETE FROM MediaAnuncio WHERE id=#{idUser}")
  public void delete(int idUSer);
}



// #{},#{},#{},#{},#{},#{},#{},#{},{}#{},#{},#{},#{}