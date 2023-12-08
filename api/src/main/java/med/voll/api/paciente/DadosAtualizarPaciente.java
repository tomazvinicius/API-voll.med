package med.voll.api.paciente;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizarPaciente(
        @NotNull
        Long id,
        String nome,
        String email,
        String telefone
                                     ) {

}
