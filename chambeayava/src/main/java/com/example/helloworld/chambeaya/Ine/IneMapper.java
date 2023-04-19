package com.example.helloworld.chambeaya.Ine;

import java.util.List;

  import org.apache.ibatis.annotations.Delete;
	import org.apache.ibatis.annotations.Insert;
	import org.apache.ibatis.annotations.Select;
	import org.apache.ibatis.annotations.Update;
    // import org.springframework.stereotype.Repository;

  // @repository

public interface IneMapper {
  @Select("SELECT * FROM ine")
      public List<Ine> getAll();
  
      @Select("SELECT * FROM ine WHERE id = #{id} ")
      public Ine getById(int id);
  
      @Insert("INSERT INTO ine VALUES(#{id},#{idUser},#{nombre},#{identificacion},#{activa})")
      public void insert(Ine p);
  
      @Update("UPDATE ine SET  id_user=#{id_user},nombre=#{nombre},identificacion=#{identificacion},activa=#{activa} WHERE id=#{id}")
      public void update(Ine p);
  

      @Delete("DELETE FROM ine WHERE id=#{id}")
      public void delete(int id);	
}
