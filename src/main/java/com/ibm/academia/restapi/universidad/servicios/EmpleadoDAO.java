package com.ibm.academia.restapi.universidad.servicios;


import com.ibm.academia.restapi.universidad.enumeradores.TipoEmpleado;
import com.ibm.academia.restapi.universidad.modelo.entidades.Empleado;
import com.ibm.academia.restapi.universidad.modelo.entidades.Persona;

public interface EmpleadoDAO extends ProfesorDAO
{
	public Iterable<Persona> findEmpleadoByTipoEmpleado(TipoEmpleado tipoEmpleado);
	public Persona actualizar(Long empleadoId, Empleado empleado);
}
