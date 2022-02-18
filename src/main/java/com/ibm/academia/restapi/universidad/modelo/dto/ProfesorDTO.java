package com.ibm.academia.restapi.universidad.modelo.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import com.ibm.academia.restapi.universidad.modelo.entidades.Direccion;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ProfesorDTO implements Serializable 
{
	
	
	
	private Long profesorId;
	private String nombre;
	private String apellido;
	private String dni;
	private Direccion direccion;
	private BigDecimal sueldo;
	
	private static final long serialVersionUID = 8241378867717588337L;
}