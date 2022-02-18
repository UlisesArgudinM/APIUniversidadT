package com.ibm.academia.restapi.universidad.modelo.mapper;


import com.ibm.academia.restapi.universidad.modelo.dto.PabellonDTO;

import com.ibm.academia.restapi.universidad.modelo.entidades.Pabellon;

public class PabellonMapper
{
	public static PabellonDTO mapPabellon(Pabellon pabellon)
	{
		PabellonDTO pabellonDTO = new PabellonDTO();
		pabellonDTO.setPabellonId(pabellon.getId());
		pabellonDTO.setDireccion(pabellon.getDireccion());
		pabellonDTO.setNombre(pabellon.getNombre());
		pabellonDTO.setFechaCreacion(pabellon.getFechaCreacion());
		pabellonDTO.setMetrosCuadrados(pabellon.getMetrosCuadrados());
		return pabellonDTO;
	}
}
