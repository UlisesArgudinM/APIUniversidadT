package com.ibm.academia.restapi.universidad.repositorios;


import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ibm.academia.restapi.universidad.enumeradores.TipoEmpleado;
import com.ibm.academia.restapi.universidad.modelo.entidades.Persona;

@Repository("repositorioEmpleado")
public interface EmpleadoRepository extends ProfesorRepository
{
	@Query("select e from e.empleados where e.tipo_empleado = ?1")
	public Iterable<Persona>findEmpleadoByTipoEmpleado(TipoEmpleado tipoEmpleado);
}
