package med.voll.api.medicos.medico;

import jakarta.validation.constraints.NotNull;
import med.voll.api.medicos.endereco.DadosEndereco;

public record DadosAtualizacaoMedicos(

        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco) {
}
