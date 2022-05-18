package br.com.henriquegross.clientes.model.Repository;

import br.com.henriquegross.clientes.model.Entity.Servico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicoRepository extends JpaRepository<Servico, Integer> {
}
