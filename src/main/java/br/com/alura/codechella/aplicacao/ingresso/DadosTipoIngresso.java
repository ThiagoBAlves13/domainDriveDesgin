package br.com.alura.codechella.aplicacao.ingresso;

import br.com.alura.codechella.domain.ingresso.Definicao;
import br.com.alura.codechella.domain.ingresso.Setor;

public record DadosTipoIngresso(
        Integer codigo,
        Setor setor,
        Definicao definicao
) {
}
