package com.spring.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.awt.*;
import java.time.LocalDate;
import java.util.UUID;

/**
 * Сущность для таблицы "Графики платежей"
 * @author Altukhov Alexey
 * @version 1.0
 */
@Data
@NoArgsConstructor
@Entity
public class PaymentSchedule {

    /**Id графика платежей*/
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(length=16)
    private UUID idPaymentSchedule;
    /**Id кредитного продукта*/
    @Column(length=16)
    private UUID idCreditProduct;
    /**Id клиента*/
    @Column(length=16)
    private UUID idClient;
    /**Дата генерации графика платежа*/
    private LocalDate dateGeneration;
    /**Список платежей*/
    @NonNull
    private List listPayments;

    /**
     * Главный конструктор класса
     * @param idCreditProduct Id кредитного продукта
     * @param idClient Id клиента
     * @param listPayments Список платежей
     */
    public PaymentSchedule(UUID idCreditProduct, UUID idClient, @NonNull List listPayments) {
        this.idCreditProduct = idCreditProduct;
        this.idClient = idClient;
        this.listPayments = listPayments;
    }
}
