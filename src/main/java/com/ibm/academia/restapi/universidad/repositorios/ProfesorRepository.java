package com.ibm.academia.restapi.universidad.repositorios;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ibm.academia.restapi.universidad.modelo.entidades.Persona;

@Repository("repositorioProfesor")
public interface ProfesorRepository extends PersonaRepository 
{
	@Query("select pr from profesor_carrera pr join fetch pr.carrera pc where pc.nombre = ?1")
	public Iterable<Persona>findProfesoresByCarrera(String carrera);

}
