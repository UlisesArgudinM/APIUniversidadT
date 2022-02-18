package com.ibm.academia.restapi.universidad.modelo.dto;

import java.io.Serializable;
import java.util.Date;

import com.ibm.academia.restapi.universidad.modelo.entidades.Direccion;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PabellonDTO implements Serializable 
{
	
	
	private Long pabellonId;
	private Double metrosCuadrados;
	private String nombre;
	private Direccion direccion;
	private Date fechaCreacion;
	
	private static final long serialVersionUID = -6649436062821708336L;
	
}