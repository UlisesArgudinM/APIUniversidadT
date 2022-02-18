package com.ibm.academia.restapi.universidad.servicios;

import com.ibm.academia.restapi.universidad.enumeradores.TipoPizarron;
import com.ibm.academia.restapi.universidad.modelo.entidades.Aula;

public interface AulaDAO extends GenericoDAO<Aula>
{
	public Iterable<Aula>findAulasByTipo_Pizarron(TipoPizarron tipoPizarron);
	
	public Iterable<Aula>findAulasByPabellon_Id(Integer pabellonId);
	
	public Iterable<Aula>findAulaByNumero_Aula(String numeroAula);
	public Aula actualizar(Long aulaId, Aula aula);
}
