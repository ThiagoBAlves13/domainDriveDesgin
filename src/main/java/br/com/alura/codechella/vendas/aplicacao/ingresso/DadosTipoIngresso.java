package br.com.alura.codechella.vendas.aplicacao.ingresso;

import br.com.alura.codechella.vendas.domain.ingresso.Definicao;
import br.com.alura.codechella.vendas.domain.ingresso.Setor;

public record DadosTipoIngresso(
        Integer codigo,
        Setor setor,
        Definicao definicao
) {
}
