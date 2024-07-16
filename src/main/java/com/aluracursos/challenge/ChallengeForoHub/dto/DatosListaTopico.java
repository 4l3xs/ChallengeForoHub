package com.aluracursos.challenge.ChallengeForoHub.dto;

import com.aluracursos.challenge.ChallengeForoHub.model.Curso;
import com.aluracursos.challenge.ChallengeForoHub.model.Topico;

public record DatosListaTopico(Long id, String titulo, String mensaje, Curso curso) {
    public DatosListaTopico(Topico topico) {
        this(topico.getId(), topico.getTitulo(), topico.getMensaje(), topico.getCurso());
    }
}
