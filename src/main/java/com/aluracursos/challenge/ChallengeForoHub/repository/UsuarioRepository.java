package com.aluracursos.challenge.ChallengeForoHub.repository;

import com.aluracursos.challenge.ChallengeForoHub.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Usuario findByLogin(String login);
}
