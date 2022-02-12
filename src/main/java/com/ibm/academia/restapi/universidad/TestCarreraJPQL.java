package com.ibm.academia.restapi.universidad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.ibm.academia.restapi.universidad.modelo.entidades.Carrera;
import com.ibm.academia.restapi.universidad.servicios.CarreraDAO;

public class TestCarreraJPQL implements CommandLineRunner
{
	@Autowired
	private CarreraDAO carreraDao;
	
	@Override
	public void run(String...args) throws Exception
	{
		Carrera ingSistemas = new Carrera(null, "Ingeniero en Sistemas",60,5, "nsegura");
		Carrera ingIndustrial = new Carrera(null, "Ingenieria Industrial",55,5, "nsegura");
		Carrera ingAlimentos = new Carrera(null, "Ingenieria en Alimentos",53,5, "nsegura");
		Carrera ingElectronica = new Carrera(null, "Ingenieria Electronica",45,5, "nsegura");
		Carrera licSistemas = new Carrera(null, "Licenciatura en Sistemas",40,4, "nsegura");
		Carrera licTurismo = new Carrera(null, "Licenciatura en Turismo",42,4, "nsegura");
		Carrera licYoga = new Carrera(null, "Licenciatura en Yoga",25,3, "nsegura");
		Carrera licRecursos = new Carrera(null, "Licenciatura en Recursos Humanos RRHH",33,3, "nsegura");
		
		carreraDao.guardar(ingSistemas);
		carreraDao.guardar(ingIndustrial);
		carreraDao.guardar(ingAlimentos);
		carreraDao.guardar(ingElectronica);
		carreraDao.guardar(licSistemas);
		carreraDao.guardar(licTurismo);
		carreraDao.guardar(licYoga);
		carreraDao.guardar(licRecursos);
	}
}
