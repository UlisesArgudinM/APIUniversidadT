package com.ibm.academia.restapi.universidad.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ibm.academia.restapi.universidad.modelo.entidades.Carrera;

@Repository
public interface CarreraRepository extends CrudRepository<Carrera, Long>
{
	//@Query("select c from Carrera c where c.nombre like %?1%")
	//Estas consultas son query metho 
	public Iterable<Carrera>findCarrerasByNombreContains(String nombre);
	
	//@Query("select c from Carrera c where upper(c.nombre) like upper( %?1%"))
	public Iterable<Carrera>findCarrerasByNombreContainsIgnoreCase(String nombre);
	
	//@Query("select c from Carrera c where c.cantidadAnios > ?1)
	public Iterable<Carrera>findCarreraByCantidadAniosAfter(Integer cantidadAnios);
	
	@Query(value = "select c.* from ")
	public List<Carrera>buscarCarreraPorNombre(String nombre);
	
	@Query("select c from Profesor_carrera c join fetch c.profesor prof where prof.nombre = ?1 and prof.apellido = ?2 ")
	public Iterable<Carrera>buscarCarrerasPorProfesorNombreYApellido(String nombre, String apellido);
}
