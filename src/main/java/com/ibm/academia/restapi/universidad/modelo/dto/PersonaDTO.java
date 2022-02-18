package com.ibm.academia.restapi.universidad.modelo.dto;

import java.io.Serializable;
import java.util.Date;


import com.ibm.academia.restapi.universidad.modelo.entidades.Direccion;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PersonaDTO implements Serializable 
{
	
	
	
	private Long personaId;
	private String nombre;
	private String apellido;
	private String dni;
	private Date fechaCreacion;
	private Direccion direccion;
	
	private static final long serialVersionUID = 3124871809055780847L;
}
