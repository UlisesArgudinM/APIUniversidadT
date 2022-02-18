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

import com.ibm.academia.restapi.universidad.modelo.entidades.Pabellon;

import com.ibm.academia.restapi.universidad.repositorios.PabellonRepository;


public class PabellonDAOImplTest 
{
	private PabellonDAO pabellonDao;
	private PabellonRepository pabellonRepository;
	@BeforeEach
	void setUp() 
	{
		pabellonRepository = mock(PabellonRepository.class);
		pabellonDao = new PabellonDAOImpl(pabellonRepository);
	}
	
	@Test
	@DisplayName("Test: Buscar pabellones por nombre")
	void findPabellonesByNombre()
	{
		String nombrePabellon= "Pabellon1";
				//Given
				when(pabellonRepository.findPabellonesByNombre(nombrePabellon))
				.thenReturn(Arrays.asList(DatosDummy.pabellon01()));
				//When
				List<Pabellon> expected = (List<Pabellon>) pabellonDao.findPabellonesByNombre(nombrePabellon);
				//Then
				assertThat(expected.get(0)).isEqualTo(DatosDummy.pabellon01());
				
				verify(pabellonRepository).findPabellonesByNombre(nombrePabellon);
	}

}
