package com.ibm.academia.restapi.universidad.servicios;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;

import com.ibm.academia.restapi.universidad.datos.DatosDummy;
import com.ibm.academia.restapi.universidad.enumeradores.TipoEmpleado;

import com.ibm.academia.restapi.universidad.modelo.entidades.Empleado;
import com.ibm.academia.restapi.universidad.repositorios.EmpleadoRepository;


public class EmpleadoDAOImplTest 
{
	private EmpleadoDAO empleadoDao;
	private EmpleadoRepository empleadoRepository;
	
	@BeforeEach
	void setUp() 
	{
		empleadoRepository = mock(EmpleadoRepository.class);
		empleadoDao = new EmpleadoDAOImpl(empleadoRepository);
	}
	
	@Test
	@DisplayName(" Test: Buscar empleado por tipo de empleado")
	void findEmpleadoByTipoEmpleado()
	{
		when(empleadoRepository.findEmpleadoByTipoEmpleado(TipoEmpleado.ADMINISTRATIVO))
		.thenReturn(Arrays.asList(DatosDummy.empleado01()));
		//When
		Empleado expected = (Empleado) empleadoDao.findEmpleadoByTipoEmpleado(TipoEmpleado.ADMINISTRATIVO);
		
		//Then
		assertThat(expected).isEqualTo(DatosDummy.empleado01());
		
		verify(empleadoRepository).findEmpleadoByTipoEmpleado(TipoEmpleado.ADMINISTRATIVO);
		
	}

}
