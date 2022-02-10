package com.ibm.academia.restapi.universidad.servicios;

import java.util.Optional;

import com.ibm.academia.restapi.universidad.modelo.entidades.Direccion;
import com.ibm.academia.restapi.universidad.modelo.entidades.Pabellon;

public interface PabellonDAO extends GenericoDAO<Pabellon>
{
	public Optional<Pabellon>findPabellonesByLocalidad(Direccion direccion);
	public Optional<Pabellon>findPabellonesByNombre(String nombre);
}
