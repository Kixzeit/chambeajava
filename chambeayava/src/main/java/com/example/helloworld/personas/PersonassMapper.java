package com.example.helloworld.personas;

import java.util.List;

import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonassMapper {
    @Select("SELECT * FROM Persona")
    public List<Personass> getAll();
    
    @Select("SELECT * FROM Persona WHERE id = #{id} ")
    public Personass getById(int id);

    @Insert("INSERT INTO Persona VALUES(#{id},#{nombre},#{apPat},#{apMaterno},#{sueldo},#{genero})")
    public void insert(Personass p);
    
    @Update("UPDATE Persona SET id=#{id}, nombre=#{nombre}, apPat=#{apPat}, apMaterno=#{apMaterno}, sueldo=#{sueldo}, genero=#{genero} ")
    public void update(Personass p);
    
    @Delete("DELETE FROM Persona WHER id=#{idPersona}")
    public void delete(int idPersona);
}
