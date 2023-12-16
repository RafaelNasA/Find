package com.agencia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.agencia.models.Contato;

public interface ContatoRepository extends JpaRepository<Contato, Long> {

}
