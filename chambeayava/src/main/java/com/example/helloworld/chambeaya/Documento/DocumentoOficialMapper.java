package com.example.helloworld.chambeaya.Documento;

import java.util.List;

  import org.apache.ibatis.annotations.Delete;
	import org.apache.ibatis.annotations.Insert;
	import org.apache.ibatis.annotations.Select;
	import org.apache.ibatis.annotations.Update;
    // import org.springframework.stereotype.Repository;

  // @repository
    public interface DocumentoOficialMapper {

      @Select("SELECT * FROM Documento")
      public List<DocumentoOficial> getAll();
  
      @Select("SELECT * FROM Documento WHERE id = #{id} ")
      public DocumentoOficial getById(int id);
  
      @Insert("INSERT INTO Documento VALUES(#{id},#{idUser},#{nombre})")
      public void insert(DocumentoOficial p);
  
      @Update("UPDATE Documento SET  idUser=#{idUser}, nombre=#{nombre} WHERE id=#{id}")
      public void update(DocumentoOficial p);
  

      @Delete("DELETE FROM Documento WHERE id=#{idUser}")
      public void delete(int idUSer);	


    }












