package com.ibm.academia.restapi.universidad.datos;

import java.math.BigDecimal;
import java.util.Optional;

import com.ibm.academia.restapi.universidad.enumeradores.TipoEmpleado;
import com.ibm.academia.restapi.universidad.enumeradores.TipoPizarron;
import com.ibm.academia.restapi.universidad.modelo.entidades.Alumno;
import com.ibm.academia.restapi.universidad.modelo.entidades.Aula;
import com.ibm.academia.restapi.universidad.modelo.entidades.Carrera;
import com.ibm.academia.restapi.universidad.modelo.entidades.Direccion;
import com.ibm.academia.restapi.universidad.modelo.entidades.Empleado;
import com.ibm.academia.restapi.universidad.modelo.entidades.Pabellon;
import com.ibm.academia.restapi.universidad.modelo.entidades.Persona;
import com.ibm.academia.restapi.universidad.modelo.entidades.Profesor;

public class DatosDummy 
{
	public static Carrera carrera01() 
	{
		return new Carrera(null, "Ingenieria en Sistemas", 50, 5, "nsegura"); 
	}

	public static Carrera carrera02() 
	{
		return new Carrera(null, "Licenciatura en Sistemas", 45, 4, "nsegura");
	}

	public static Carrera carrera03() 
	{
		return new Carrera(null, "Ingenieria Industrial", 60, 5, "nsegura");
	}
	
	public static Persona empleado01() 
	{
		return new Empleado(null, "Lautaro", "Lopez", "25147036", "nsegura", new Direccion(), new BigDecimal("46750"), TipoEmpleado.ADMINISTRATIVO);
	}
	
	public static Persona empleado02() 
	{
		return new Empleado(null, "Lenadro", "Lopez", "25174630", "nsegura", new Direccion(), new BigDecimal("46750.70"), TipoEmpleado.MANTENIMIENTO);
	}
	
	public static Persona profesor01()
	{
		return new Profesor(null, "Martin", "Axacar", "4477899", "nsegura", new Direccion(), new BigDecimal("600000"));
	}
	public static Optional<Persona> persona01()
	{
		return Optional.of(new Alumno(null, "Ulises", "Argudin", "2016178", "nsegura", new Direccion()));
	}
	public static Optional<Persona> persona02()
	{
		return Optional.of(new Alumno(null, "Lola", "Montano", "20161784", "nsegura", new Direccion()));
	}
	public static Persona persona03()
	{
		return new Alumno(null, "Sara", "Lopez", "201617847", "nsegura", new Direccion());
	}
	
	public static Persona alumno01()
	{
		return new Alumno(null, "Jhon", "Benitez", "4223715", "nsegura", new Direccion());
	}
	
	public static Persona alumno02() 
	{
		return new Alumno(null, "Andres", "Benitez", "45233891", "nsegura", new Direccion());
	}

	public static Persona alumno03() 
	{
		return new Alumno(null, "Joaquin", "Leon", "45233012", "nsegura", new Direccion());
	}
	public static Aula aula01()
	{
		return new Aula(null, "1", "30x30",30 , TipoPizarron.PIZARRA_BLANCA, "nsegura");
	}
	public static Aula aula02() 
	{
		return new Aula(null, "2", "25x30",30 , TipoPizarron.PIZARRA_TIZA, "nsegura");
	}
	public static Aula aula03() 
	{
		return new Aula(null, "3", "20x30",30 , TipoPizarron.PIZARRA_BLANCA, "nsegura");
	}
	public static Pabellon pabellon01() 
	{
	return new Pabellon(null, 32.0, "Pabellon1", new Direccion(), "nsegura");	
	}
	public static Pabellon pabellon02() 
	{
	return new Pabellon(null, 32.0, "Pabellon2", new Direccion(), "nsegura");	
	}
	public static Pabellon pabellon03() 
	{
	return new Pabellon(null, 32.0, "Pabellon3", new Direccion(), "nsegura");	
	}
}