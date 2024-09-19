package med.voll.api.medicos.medico;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.api.medicos.endereco.DadosEndereco;

public record DadosCadastroMedicos(


        @NotBlank /*é uma anotação para garantir que um campo de texto não esteja vazio
        e não contenha apenas espaços em branco.*/
        String nome,

        @NotBlank
        @Email //é usada para garantir que uma string segue o formato de um endereço de email válido.
        String email,

        @NotBlank
        String telefone,

        @NotBlank
        @Pattern(regexp = "\\d{4,6}") /*a anotação está sendo usada para garantir que uma
         string contenha apenas dígitos (\d) e que a string tenha entre 4 e 6
         caracteres de comprimento.*/
        String crm,

        @NotNull
        Especialidade especialidade,


        @NotNull @Valid DadosEndereco endereco) {
}
