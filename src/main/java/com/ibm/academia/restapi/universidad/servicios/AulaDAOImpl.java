package com.ibm.academia.restapi.universidad.servicios;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ibm.academia.restapi.universidad.enumeradores.TipoPizarron;
import com.ibm.academia.restapi.universidad.modelo.entidades.Aula;
import com.ibm.academia.restapi.universidad.repositorios.AulaRepository;

@Service
public class AulaDAOImpl extends GenericoDAOImpl<Aula, AulaRepository> implements AulaDAO
{
	
	@Autowired
	public AulaDAOImpl(AulaRepository repository) {
		super(repository);
		
	}

	@Override
	@Transactional(readOnly = true)
	public Iterable<Aula>findAulasByTipo_Pizarron(TipoPizarron tipoPizarron) {
		// TODO Auto-generated method stub
		return repository.findAulasByTipo_Pizarron(tipoPizarron);
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Aula>findAulasByPabellon_Id(String pabellon) {
		// TODO Auto-generated method stub
		return repository.findAulasByPabellon_Id(pabellon);
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Aula>findAulaByNumero_Aula(String numeroAula) {
		// TODO Auto-generated method stub
		return repository.findAulaByNumero_Aula(numeroAula);
	}

	
	
}
