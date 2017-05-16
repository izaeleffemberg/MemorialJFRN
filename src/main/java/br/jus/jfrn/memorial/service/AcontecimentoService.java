package br.jus.jfrn.memorial.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.jus.jfrn.memorial.model.Acontecimento;
import br.jus.jfrn.memorial.repository.AcontecimentoRepository;

@Service
public class AcontecimentoService {
	
	@Autowired
	private AcontecimentoRepository repository;
	
	public Iterable<Acontecimento> listaTodos(){
		Iterable<Acontecimento> lista = repository.findAll();
		return lista;
	}

}
