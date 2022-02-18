package com.ibm.academia.restapi.universidad.servicios;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;

import com.ibm.academia.restapi.universidad.datos.DatosDummy;
import com.ibm.academia.restapi.universidad.modelo.entidades.Persona;
import com.ibm.academia.restapi.universidad.repositorios.PersonaRepository;


public class PersonaDAOImplTest
{
	private PersonaDAO personaDao;
	private PersonaRepository personaRepository;
	
	@BeforeEach
	void setUp() 
	{
		personaRepository = mock(PersonaRepository.class);
		personaDao = new PersonaDAOImpl(personaRepository);
	}
	
	@Test
	@DisplayName("Test: Buscar por Nombre y Apellido")
	void buscarPorNombreYApellido()
	{
		String nombre = "Ulises";
		String apellido = "Argudin";
		//Given
		when(personaRepository.buscarPorNombreYApellido(nombre, apellido))
		.thenReturn(DatosDummy.persona01());
		//When
		Optional<Persona> expected = personaDao.buscarPorNombreYApellido(nombre, apellido);
		//Then
		assertThat(expected).isEqualTo(DatosDummy.persona01());
		
		verify(personaRepository).buscarPorNombreYApellido(nombre, apellido);
		
	}
	
	@Test
	@DisplayName("Test: Buscar persona por DNI")
	void buscarPorDni() 
	{
		String dni = "20161784";
				//Given
				when(personaRepository.buscarPorDni(dni))
				.thenReturn(DatosDummy.persona01());
				//When
				Optional<Persona> expected = personaDao.buscarPorDni(dni);
				//Then
				assertThat(expected).isEqualTo(DatosDummy.persona02());
				
				verify(personaRepository).buscarPorDni(dni);
		
		
	}
	

}
