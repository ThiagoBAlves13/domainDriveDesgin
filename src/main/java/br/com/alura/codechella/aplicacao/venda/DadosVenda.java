package br.com.alura.codechella.aplicacao.venda;

import java.util.List;

import br.com.alura.codechella.aplicacao.ingresso.DadosTipoIngresso;
import br.com.alura.codechella.aplicacao.usuario.DadosUsuario;

public record DadosVenda(
        Long id,
        DadosUsuario usuario,
        List<DadosTipoIngresso> ingressos
) {
}
