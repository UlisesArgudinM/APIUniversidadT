package com.ibm.academia.restapi.universidad.servicios;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.transaction.annotation.Transactional;

import com.ibm.academia.restapi.universidad.modelo.entidades.Persona;
import com.ibm.academia.restapi.universidad.repositorios.PersonaRepository;
import com.ibm.academia.restapi.universidad.repositorios.ProfesorRepository;

public class ProfesorDAOImpl extends PersonaDAOImpl implements ProfesorDAO
{

	public ProfesorDAOImpl(@Qualifier("repositorioProfesor")PersonaRepository repository)
	{
		super(repository);
		
	}
	@Override
	@Transactional(readOnly = true)
	public Iterable<Persona>findProfesoresByCarrera(String carrera){
		return ((ProfesorRepository)repository).findProfesoresByCarrera(carrera);

	}
}
