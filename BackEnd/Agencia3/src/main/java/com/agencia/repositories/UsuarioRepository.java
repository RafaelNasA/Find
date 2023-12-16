package com.agencia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agencia.models.Usuario;


public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
