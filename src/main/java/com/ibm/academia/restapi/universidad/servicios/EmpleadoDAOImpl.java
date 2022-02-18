package com.ibm.academia.restapi.universidad.servicios;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.transaction.annotation.Transactional;

import com.ibm.academia.restapi.universidad.enumeradores.TipoEmpleado;
import com.ibm.academia.restapi.universidad.excepciones.NotFoundException;
import com.ibm.academia.restapi.universidad.modelo.entidades.Empleado;
import com.ibm.academia.restapi.universidad.modelo.entidades.Persona;
import com.ibm.academia.restapi.universidad.repositorios.EmpleadoRepository;
import com.ibm.academia.restapi.universidad.repositorios.PersonaRepository;

public class EmpleadoDAOImpl extends ProfesorDAOImpl implements EmpleadoDAO
{

	public EmpleadoDAOImpl(@Qualifier("repositorioEmpleado")PersonaRepository empleadoRepository) {
		super(empleadoRepository);
		
	}

	@Override
	@Transactional(readOnly = true)
	public Iterable<Persona> findEmpleadoByTipoEmpleado(TipoEmpleado tipoEmpleado) {
		
		return ((EmpleadoRepository)repository).findEmpleadoByTipoEmpleado(tipoEmpleado);
	}

	@Override
	@Transactional
	public Persona actualizar(Long empleadoId, Empleado empleado) 
	{
		Optional<Persona> oEmpleado = repository.findById(empleadoId);
		
		if(!oEmpleado.isPresent())
			throw new NotFoundException(String.format("El empleado con ID %d no existe", empleadoId)); 
		
		Empleado empleadoActualizada = null;
		oEmpleado.get().setApellido(empleado.getApellido());
		oEmpleado.get().setDireccion(empleado.getDireccion());
		empleadoActualizada = (Empleado) repository.save(oEmpleado.get());
		return empleadoActualizada;
	}

	
}
