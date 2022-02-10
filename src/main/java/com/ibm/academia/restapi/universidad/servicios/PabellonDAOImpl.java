package com.ibm.academia.restapi.universidad.servicios;

import java.util.Optional;

import org.springframework.transaction.annotation.Transactional;

import com.ibm.academia.restapi.universidad.modelo.entidades.Direccion;
import com.ibm.academia.restapi.universidad.modelo.entidades.Pabellon;
import com.ibm.academia.restapi.universidad.repositorios.PabellonRepository;

public class PabellonDAOImpl extends GenericoDAOImpl<Pabellon, PabellonRepository> implements PabellonDAO 
{

	public PabellonDAOImpl(PabellonRepository pabellonRepository) {
		super(pabellonRepository);
		
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Pabellon>findPabellonesByLocalidad(Direccion direccion) {
		
		return repository.findPabellonesByLocalidad(direccion);
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Pabellon>findPabellonesByNombre(String nombre) {
		
		return repository.findPabellonesByNombre(nombre);
	}

	
}
