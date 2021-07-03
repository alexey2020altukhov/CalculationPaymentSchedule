package com.spring.repositories;

import com.spring.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

/**
 * Репозиторий к таблице "Клиенты"
 * @author Altukhov Alexey
 * @version 1.0
 */
public interface ClientRepository extends JpaRepository<Client, UUID> {
}
