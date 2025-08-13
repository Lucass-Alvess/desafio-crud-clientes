package com.devlucas.desafio_cliente.repositories;

import com.devlucas.desafio_cliente.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
