package com.aluracursos.challenge.ChallengeForoHub.dto;

import com.aluracursos.challenge.ChallengeForoHub.model.Curso;
import com.aluracursos.challenge.ChallengeForoHub.model.Topico;

import java.time.LocalDateTime;

public record DatosDetalleTopico(String titulo, String mensaje, LocalDateTime fechaCreacion, Curso curso) {
    public DatosDetalleTopico(Topico topico) {
        this(topico.getTitulo(), topico.getMensaje(), topico.getFechaCreacion(), topico.getCurso());
    }
}
