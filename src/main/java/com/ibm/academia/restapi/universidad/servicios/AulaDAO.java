package com.ibm.academia.restapi.universidad.servicios;

import java.util.Optional;


import com.ibm.academia.restapi.universidad.enumeradores.TipoPizarron;
import com.ibm.academia.restapi.universidad.modelo.entidades.Aula;

public interface AulaDAO extends GenericoDAO<Aula>
{
	public Iterable<Aula>findAulasByTipo_Pizarron(TipoPizarron tipoPizarron);
	
	public Optional<Aula>findAulasByPabellon_Id(String pabellon);
	
	public Optional<Aula>findAulaByNumero_Aula(String numeroAula);
}
