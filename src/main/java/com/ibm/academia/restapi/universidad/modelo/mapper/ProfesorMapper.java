package com.ibm.academia.restapi.universidad.modelo.mapper;


import com.ibm.academia.restapi.universidad.modelo.dto.ProfesorDTO;
import com.ibm.academia.restapi.universidad.modelo.entidades.Profesor;

public class ProfesorMapper 
{
	public static ProfesorDTO mapProfesor(Profesor profesor)
	{
		ProfesorDTO profesorDTO = new ProfesorDTO();
		profesorDTO.setNombre(profesor.getNombre());
		profesorDTO.setApellido(profesor.getApellido());
		profesorDTO.setDireccion(profesor.getDireccion());
		profesorDTO.setDni(profesor.getDni());
		profesorDTO.setSueldo(profesor.getSueldo());
		return profesorDTO;
	}
}
