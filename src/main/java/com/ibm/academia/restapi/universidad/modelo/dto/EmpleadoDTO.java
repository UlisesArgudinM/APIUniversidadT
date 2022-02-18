package com.ibm.academia.restapi.universidad.modelo.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.ibm.academia.restapi.universidad.enumeradores.TipoEmpleado;
import com.ibm.academia.restapi.universidad.modelo.entidades.Direccion;
import com.ibm.academia.restapi.universidad.modelo.entidades.Pabellon;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class EmpleadoDTO implements Serializable 
{
	
	private Long empleadoId;
	private String nombre;
	private String apellido;
	private String dni;
	private Direccion direccion;
	private BigDecimal sueldo;
	private TipoEmpleado tipoEmpleado;
	private Pabellon pabellon;
	private Date fechaCreacion;
	
	private static final long serialVersionUID = 1511310637434896874L;
}