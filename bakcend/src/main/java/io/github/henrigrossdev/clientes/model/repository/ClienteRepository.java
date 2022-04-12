package io.github.henrigrossdev.clientes.model.repository;

import io.github.henrigrossdev.clientes.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
