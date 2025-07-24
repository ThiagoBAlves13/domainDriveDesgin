package br.com.alura.codechella.vendas.aplicacao.evento;

import java.time.LocalDateTime;
import java.util.List;

import br.com.alura.codechella.vendas.aplicacao.ingresso.DadosCadastroTipoIngresso;
import br.com.alura.codechella.vendas.domain.evento.Categoria;

public record DadosEvento(
        Long id,
        Categoria categoria,
        String descricao,
        DadosEndereco endereco,
        LocalDateTime data,
        List<DadosCadastroTipoIngresso> tipoIngressos
) {
}
