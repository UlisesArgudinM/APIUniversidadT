package com.ibm.academia.restapi.universidad.modelo.mapper;


import com.ibm.academia.restapi.universidad.modelo.dto.PersonaDTO;

import com.ibm.academia.restapi.universidad.modelo.entidades.Persona;

public class PersonaMapper
{
	public static PersonaDTO mapPersona(Persona persona)
	{
		PersonaDTO personaDTO = new PersonaDTO();
		personaDTO.setNombre(persona.getNombre());
		personaDTO.setApellido(persona.getApellido());
		personaDTO.setDireccion(persona.getDireccion());
		personaDTO.setDni(persona.getDni());
		personaDTO.setFechaCreacion(persona.getFechaCreacion());
		return personaDTO;
	}
}
