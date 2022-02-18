package com.ibm.academia.restapi.universidad.repositorios;


import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.ibm.academia.restapi.universidad.datos.DatosDummy;
import com.ibm.academia.restapi.universidad.modelo.entidades.Pabellon;

@DataJpaTest
public class PabellonRepositoryTest 
{
	@Autowired
	private PabellonRepository pabellonRepository;
	
	
	
	@Test
	@DisplayName("Test: Buscar pabellones por nombre")
	void findPabellonesByNombre()
	{
		//Given
		pabellonRepository.save(DatosDummy.pabellon01());
		pabellonRepository.save(DatosDummy.pabellon02());
		pabellonRepository.save(DatosDummy.pabellon03());
		//When
		List<Pabellon> expected = (List<Pabellon>) pabellonRepository.findPabellonesByNombre("Pabellon1");
		
		//Then
		assertThat(expected.size() == 1).isTrue();
	}
}
