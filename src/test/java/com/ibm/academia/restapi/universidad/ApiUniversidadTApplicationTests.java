package com.ibm.academia.restapi.universidad;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApiUniversidadTApplicationTests
{
	Calculadora calculadora = new Calculadora();
	
	@Test
	@Disabled
	@DisplayName("Test: Suma de valores a y b")
	void sumarValores() 
	{
		//Tecnica GWT
		
		//Given --> Es cuando se define el contexto o las precondiciones
		Integer valorA = 2;
		Integer valorB = 3;
		
		//When --> Es cuando se ejecuta la accion
		Integer expected = calculadora.sumar(valorA,valorB);
		
		//Then -- > Es cuando se debe validar que lo que se esta probando funciona correctamente
		Integer resultadoEsperado = 22;
		assertThat(expected).isEqualTo(resultadoEsperado);
		
	}
	class Calculadora
	{
		Integer sumar (Integer valorA,Integer valorB)
		{
			return valorA + valorB;
		}
	}

}
