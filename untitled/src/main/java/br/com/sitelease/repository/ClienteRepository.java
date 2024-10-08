package br.com.sitelease.repository;

import br.com.sitelease.model.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Para MySQL
@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    // Você pode adicionar métodos de consulta personalizados aqui, se necessário
}
