package io.github.henrigrossdev.clientes.model.repository;

import io.github.henrigrossdev.clientes.model.entity.Servico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicoRepository extends JpaRepository<Servico, Integer> {
}
