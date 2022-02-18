package com.ibm.academia.restapi.universidad.modelo.dto;

import java.io.Serializable;
import java.util.Date;

import com.ibm.academia.restapi.universidad.enumeradores.TipoPizarron;
import com.ibm.academia.restapi.universidad.modelo.entidades.Pabellon;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AulaDTO implements Serializable 
{
	
	
	private Long aulaId;
	private String numeroAula;
	private String medidas;
	private Integer cantidadPupitres;
	private TipoPizarron tipoPizarron;
	private Pabellon pabellon;
	private Date fechaCreacion;
	
	private static final long serialVersionUID = 382117993863671414L;
}