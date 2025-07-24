package br.com.alura.codechella.vendas.aplicacao.evento;

import java.util.List;

import br.com.alura.codechella.vendas.domain.evento.Evento;

public interface RepositorioDeEvento {
	
	List<Evento> buscarEventoPorCidade(String cep);

}
