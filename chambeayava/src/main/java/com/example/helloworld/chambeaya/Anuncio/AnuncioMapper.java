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
  
      @Insert("INSERT INTO Anuncio VALUES(#{id},#{idUser},#{descripcionPequeña},#{descripcioCompleta},#{codigoPostal},#{oficio},#{telefonoNegocio},#{correoNegocio})")
      public void insert(Anuncio p);
  
      @Update("UPDATE Anuncio SET  idUser=#{idUser},descripcionPequeña=#{descripcionPequeña}, descripcioCompleta=#{descripcioCompleta},codigoPostal=#{codigoPostal},oficio=#{oficio},telefonoNegocio=#{telefonoNegocio},correoNegocio=#{correoNegocio}")
      public void update(Anuncio p);

      @Delete("DELETE FROM Anuncio WHERE id=#{idUser}")
      public void delete(int idUSer);	

      // #{id},#{idUser},#{descripcionPequeña},#{descripcioCompleta},#{codigoPostal},#{oficio},#{telefonoNegocio},#{correoNegocio},#{nick},#{},#{},#{},#{}
}


// INSERT INTO`chambeaya`.`Anuncio`
// (`idAnuncio`,`id_user`,`Descripcion_Pequeña`,`Descripcion_Completa`,
// `Codigo_Postal`,`Oficio`,`Telefono_Negocio`,`Correo_Negocio`,`Nick`)

// VALUES ('1', '1', 'cgdhjk', 'sfxgjcg', 'sdfh', 'adfg', 'asdf', 'SDFSDF', 'asdfasdf');
