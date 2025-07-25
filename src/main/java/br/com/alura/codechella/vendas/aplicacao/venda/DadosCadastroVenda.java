package br.com.alura.codechella.vendas.aplicacao.venda;

import java.util.List;

import br.com.alura.codechella.vendas.aplicacao.ingresso.DadosCadastroIngresso;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

public record DadosCadastroVenda(
        @NotNull(message = "O id do usuário é obrigatório!")
        Long usuario_id,
        @NotNull(message = "Os dados do ingresso devem ser informados")
        @Valid
        List<DadosCadastroIngresso> ingressos

) {

}
