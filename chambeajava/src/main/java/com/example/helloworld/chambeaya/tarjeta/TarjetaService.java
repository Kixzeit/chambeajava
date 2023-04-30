package com.example.helloworld.chambeaya.tarjeta;

import java.util.List;

import com.example.helloworld.chambeaya.tarjeta.model.Tarjeta;


public interface TarjetaService {
  /**
   * Retorna todos los productos guardados en la base de datos.
   * 
   * @return Lista de Productos provenientes de la base de datos.
   */
  List<Tarjeta> getAllCards();
  

  List<Tarjeta> getAllCardsByid(int id);
  /**
   * Regresa un objeto de tipo 'Producto' el cual
   * tiene por id, el argumento pasado a este método.
   * Si no existe ningún producto con ese id, este método
   * regresa un producto nulo (null)
   * 
   * @param id Llave del producto a ser buscado
   * @return Producto asociado al id proporcionado
   */
  Tarjeta getCardByid(int id);

  /**
   * Busca el producto dado y si no está en la base de datos,
   * lo inserta, pero si está en la base, lo actualiza.
   * 
   * @param producto Producto a ser insertado o actualizado
   */
  void save(Tarjeta Tarjeta);

  /**
   * Elimina el producto cuyo id es el dado.
   * Si no existe ningún producto con ese di, no hace nada.
   * 
   * @param id Entero asociado a un posible producto.
   */
  void kill(int id);

}