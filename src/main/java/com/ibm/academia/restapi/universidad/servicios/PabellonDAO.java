package com.ibm.academia.restapi.universidad.servicios;

import com.ibm.academia.restapi.universidad.modelo.entidades.Direccion;
import com.ibm.academia.restapi.universidad.modelo.entidades.Pabellon;

public interface PabellonDAO extends GenericoDAO<Pabellon>
{
	public Iterable<Pabellon>findPabellonesByLocalidad(Direccion direccion);
	public Iterable<Pabellon>findPabellonesByNombre(String nombre);
	public Pabellon actualizar(Long pabellonId, Pabellon pabellon);
}
