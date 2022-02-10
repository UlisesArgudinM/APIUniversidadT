package com.ibm.academia.restapi.universidad.repositorios;


import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ibm.academia.restapi.universidad.modelo.entidades.Direccion;
import com.ibm.academia.restapi.universidad.modelo.entidades.Pabellon;

@Repository
public interface PabellonRepository extends CrudRepository<Pabellon, Long>
{
	
	public Optional<Pabellon>findPabellonesByLocalidad(Direccion direccion);
	
	
	public Optional<Pabellon>findPabellonesByNombre(String nombre);
}
