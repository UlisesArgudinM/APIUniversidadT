package com.ibm.academia.restapi.universidad.servicios;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;

import com.ibm.academia.restapi.universidad.datos.DatosDummy;
import com.ibm.academia.restapi.universidad.enumeradores.TipoPizarron;
import com.ibm.academia.restapi.universidad.modelo.entidades.Aula;
import com.ibm.academia.restapi.universidad.repositorios.AulaRepository;


public class AulaDAOImplTest 
{
	private AulaDAO aulaDao;
	private AulaRepository aulaRepository;
	
	@BeforeEach
	void setUp() 
	{
		aulaRepository = mock(AulaRepository.class);
		aulaDao = new AulaDAOImpl(aulaRepository);
	}
	
	
	@Test
	@DisplayName("Test: Buscar carreras por tipo de pizzarron")
	void findAulasByTipo_Pizarron() 
	{
		//Given
		when(aulaRepository.findAulasByTipo_Pizarron(TipoPizarron.PIZARRA_BLANCA))
		.thenReturn(Arrays.asList(DatosDummy.aula01(),DatosDummy.aula03()));
		//When
		List<Aula> expected = (List<Aula>)aulaDao.findAulasByTipo_Pizarron(TipoPizarron.PIZARRA_BLANCA);
		
		//Then
		assertThat(expected.get(0)).isEqualTo(DatosDummy.aula01());
		assertThat(expected.get(1)).isEqualTo(DatosDummy.aula03());
		
		verify(aulaRepository).findAulasByTipo_Pizarron(TipoPizarron.PIZARRA_BLANCA);
	}
	
	@Test
	@DisplayName("Test: Buscar Aulas por Pabellon")
	void findAulasByPabellon_Id() 
	{
		
				
				
	}
	
	@Test
	@DisplayName("Test: Buscar aula por numero de aula")
	void findAulaByNumero_Aula()
	{
		//Given
		String numAula = "2";
		when(aulaRepository.findAulaByNumero_Aula(numAula))
		.thenReturn(Arrays.asList(DatosDummy.aula02()));
		//When
        List<Aula> expected = (List<Aula>)aulaDao.findAulaByNumero_Aula(numAula);
		
		//Then
		assertThat(expected.get(0)).isEqualTo(DatosDummy.aula02());
		
		verify(aulaRepository).findAulaByNumero_Aula(numAula);
				
	}
}
