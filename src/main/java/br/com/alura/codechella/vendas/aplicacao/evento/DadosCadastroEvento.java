package br.com.alura.codechella.vendas.aplicacao.evento;

import java.time.LocalDateTime;
import java.util.List;

import br.com.alura.codechella.vendas.aplicacao.ingresso.DadosCadastroTipoIngresso;
import br.com.alura.codechella.vendas.domain.evento.Categoria;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosCadastroEvento(
        @NotNull(message = "A categoria do evento é obrigatória!")
        Categoria categoria,
        @NotBlank(message = "A descrição do evento é obrigatória!")
        String descricao,
        @NotNull(message = "O endereço do evento é obrigatório!")
        @Valid
        DadosEndereco endereco,
        @NotNull(message = "Data do evento é obrigatória!")
        @Future(message = "Data do evento deve ser uma data futura!")
        LocalDateTime data,
        @NotNull(message = "Pelo menos um tipo de ingresso deve ser informado!")
        @Valid
        List<DadosCadastroTipoIngresso> tipoIngressos

) {
}
