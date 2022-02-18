package com.ibm.academia.restapi.universidad.repositorios;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.ibm.academia.restapi.universidad.datos.DatosDummy;
import com.ibm.academia.restapi.universidad.enumeradores.TipoPizarron;
import com.ibm.academia.restapi.universidad.modelo.entidades.Aula;
import com.ibm.academia.restapi.universidad.modelo.entidades.Pabellon;

@DataJpaTest
public class AulaRepositoryTest 
{
	@Autowired
	private AulaRepository aulaRepository;
	
	@Autowired
	private PabellonRepository pabellonRepository;
	
	@BeforeEach
	void setUp()
	{
		
	}
	
	@AfterEach
	void tearDown()
	{
		aulaRepository.deleteAll();
	}
	
	@Test
	@DisplayName("Test: Buscar carreras por tipo de pizzarron")
	void findAulasByTipo_Pizarron() 
	{
		//Give
		aulaRepository.save(DatosDummy.aula01());
		aulaRepository.save(DatosDummy.aula02());
		aulaRepository.save(DatosDummy.aula03());
		//When
		List<Aula> expected = (List<Aula>)aulaRepository.findAulasByTipo_Pizarron(TipoPizarron.PIZARRA_BLANCA);
		//Then
		assertThat(expected.size() == 2).isTrue();
	}
	
	@Test
	@DisplayName("Test: Buscar Aulas por Pabellon")
	void findAulasByPabellon_Id() 
	{
		//Given
				Iterable<Aula> aulas = aulaRepository.saveAll(
		                Arrays.asList(
		                		DatosDummy.aula01(),
		                		DatosDummy.aula02(),
		                		DatosDummy.aula03())
		        );
				Pabellon pabellon = pabellonRepository.save(DatosDummy.pabellon01());
				
	
				//when
				Integer pabellonId = 2;
				List<Aula> expected = (List<Aula>)aulaRepository.findAulasByPabellon_Id(pabellonId);
				//Then
				assertThat(expected.isEmpty()).isTrue();
				
				
	}
	
	@Test
	@DisplayName("Test: Buscar aula por numero de aula")
	void findAulaByNumero_Aula()
	{
		//Give
				aulaRepository.save(DatosDummy.aula01());
				aulaRepository.save(DatosDummy.aula02());
				aulaRepository.save(DatosDummy.aula03());
		//When
				List<Aula> expected = (List<Aula>)aulaRepository.findAulaByNumero_Aula("2");
		//Then
				assertThat(expected.isEmpty()).isTrue();
				
				
	}

}
