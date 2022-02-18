package com.ibm.academia.restapi.universidad.repositorios;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;


@DataJpaTest
public class ProfesorRepositoryTest
{
	@Test
	@DisplayName("Test: Buscar profesor por carrera")
	void findProfesoresByCarrera(String carrera) 
	{
		
	}
}
