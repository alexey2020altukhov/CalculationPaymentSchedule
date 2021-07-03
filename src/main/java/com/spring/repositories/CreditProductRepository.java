package com.spring.repositories;

import com.spring.entities.CreditProduct;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

/**
 * Репозиторий к таблице "Кредитные продукты"
 * @author Altukhov Alexey
 * @version 1.0
 */
public interface CreditProductRepository extends JpaRepository<CreditProduct, UUID> {
}
