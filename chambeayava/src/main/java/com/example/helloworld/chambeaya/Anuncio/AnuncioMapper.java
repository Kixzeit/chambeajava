package com.example.helloworld.chambeaya.Anuncio;

import java.util.List;

  import org.apache.ibatis.annotations.Delete;
	import org.apache.ibatis.annotations.Insert;
	import org.apache.ibatis.annotations.Select;
	import org.apache.ibatis.annotations.Update;

public interface AnuncioMapper {
  @Select("SELECT * FROM chambeaya")
      public List<Anuncio> getAll();
  
      @Select("SELECT * FROM Anuncio WHERE id = #{id} ")
      public Anuncio getById(int id);
  
      @Insert("INSERT INTO Anuncio VALUES(#{id},#{idUser},#{nombreNegocio},#{descripcionPequeña},#{descripcionCompleta},#{codigoPostal},#{oficio},#{telefonoNegocio},#{correoNegocio}#{nickname})")
      public void insert(Anuncio p);
  
      @Update("UPDATE Anuncio SET  id_user=#{id_user},nombre_negocio=#{nombre_negocio},descripcion_pequeña=#{descripcion_pequeña},descripcion_completa=#{descripcion_completa},codigo_postal=#{codigo_postal},oficio=#{oficio},telefono_negocio=#{telefono_negocio},correo_negocio=#{correo_negocio}nickname=#{nickname} WHERE id=#{id}")
      public void update(Anuncio p);

      @Delete("DELETE FROM Anuncio WHERE id=#{id}")
      public void delete(int idUSer);	
}



