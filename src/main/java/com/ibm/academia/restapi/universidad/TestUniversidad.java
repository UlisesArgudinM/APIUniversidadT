package com.ibm.academia.restapi.universidad;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ibm.academia.restapi.universidad.modelo.entidades.Carrera;
import com.ibm.academia.restapi.universidad.modelo.entidades.Persona;
import com.ibm.academia.restapi.universidad.servicios.AlumnoDAO;
import com.ibm.academia.restapi.universidad.servicios.CarreraDAO;

@Component
public class TestUniversidad implements CommandLineRunner
{
	@Autowired
	private CarreraDAO carreraDao;
	
	@Autowired
	private AlumnoDAO alumnoDao;
	
	@Override
	public void run(String... args) throws Exception 
	{
		
		/*Carrera ingenieriasSistemas = new Carrera(null, "sistemas", 60, 5, "nsegura");
		Carrera carrera = carreraDao.guardar(ingenieriasSistemas);
		System.out.println(carrera.toString());
		*/
		/*Direccion direccionAlumno = new Direccion("Calle ciega", "75","0005","601","6","Puebla");
		Persona alumno =new Alumno(null, "Pepito", "Perez", "123456789", "nsegura", direccionAlumno);
		Persona personaAlumno = alumnoDao.guardar(alumno);
		System.out.println(personaAlumno.toString());
		 */
		
		/*List<Persona> alumnos = (List<Persona>)alumnoDao.buscarTodos();
		alumnos.forEach(System.out::println);
		*/
		/*Carrera carrera = null;
		
		Optional<Carrera> oCarrera = carreraDao.buscarPorTd(1L);
		
		if(oCarrera.isPresent()) {
			carrera = oCarrera.get();
			System.out.println(carrera.toString());
		}
		else {
			System.out.println("Carrera no se encuentra");
		}
		//Todo UPDATE
		*/
		
		
		
	}
	
	
}
