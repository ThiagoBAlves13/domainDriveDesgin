package br.com.alura.codechella.vendas.aplicacao.venda;

import java.util.List;

import br.com.alura.codechella.vendas.aplicacao.ingresso.DadosTipoIngresso;
import br.com.alura.codechella.vendas.aplicacao.usuario.DadosUsuario;

public record DadosVenda(
        Long id,
        DadosUsuario usuario,
        List<DadosTipoIngresso> ingressos
) {
}
