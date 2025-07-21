package br.com.alura.codechella.domain.evento;

import java.time.LocalDateTime;
import java.util.List;

import br.com.alura.codechella.aplicacao.ingresso.DadosCadastroTipoIngresso;
import br.com.alura.codechella.infra.evento.Endereco;

public class Evento {
	
	private Categoria categoria;
    private String descricao;
    private Endereco endereco;
    private LocalDateTime data;
    private List<DadosCadastroTipoIngresso> tipoIngressos;
    
    public void incluiNovoTipoDeIngressoAoEvento(DadosCadastroTipoIngresso tipoIngresso) {
    	this.tipoIngressos.add(tipoIngresso);
    }
    
    public void alterarCategoriaDoEvento(Categoria novaCategoria) {
    	this.categoria = novaCategoria;
    }
    
	public Categoria getCategoria() {
		return categoria;
	}
	public String getDescricao() {
		return descricao;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public LocalDateTime getData() {
		return data;
	}
	public List<DadosCadastroTipoIngresso> getTipoIngressos() {
		return tipoIngressos;
	}
      
    
}
