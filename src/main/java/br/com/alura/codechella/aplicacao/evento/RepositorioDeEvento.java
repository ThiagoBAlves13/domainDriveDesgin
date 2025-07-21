package br.com.alura.codechella.aplicacao.evento;

import java.util.List;

import br.com.alura.codechella.domain.evento.Evento;

public interface RepositorioDeEvento {
	
	List<Evento> buscarEventoPorCidade(String cep);

}
