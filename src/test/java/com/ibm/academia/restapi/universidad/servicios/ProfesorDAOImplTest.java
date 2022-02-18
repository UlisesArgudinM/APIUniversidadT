package com.ibm.academia.restapi.universidad.servicios;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import com.ibm.academia.restapi.universidad.datos.DatosDummy;
import com.ibm.academia.restapi.universidad.repositorios.ProfesorRepository;

public class ProfesorDAOImplTest 
{
	private ProfesorDAO profesorDao;
	private ProfesorRepository profesorRepository; 
	@BeforeEach
	void setUp() 
	{
		profesorRepository = mock(ProfesorRepository.class);
		profesorDao = new ProfesorDAOImpl(profesorRepository);
	}
	
	@Test
	@DisplayName("Test: Buscar profesor por carrera")
	void findProfesoresByCarrera(String carrera) 
	{
		
	}

}
