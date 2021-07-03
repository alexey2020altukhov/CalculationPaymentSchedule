package com.spring.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.UUID;

/**
 * Сущность для таблицы "Кредитные продукты"
 * @author Altukhov Alexey
 * @version 1.0
 */
@Data
@NoArgsConstructor
@Entity
public class CreditProduct {

    /**Id кредитного продукта*/
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(length=16)
    @NonNull
    private UUID idCreditProduct;
    /**Сумма кредита*/
    @Size(min = 0)
    private double loanAmount;
    /**Процентная ставка*/
    @Size(min = 0)
    private double interestRate;
    /**Срок кредита в месяцах*/
    @Size(min = 0)
    private int loanTermInMonths;
    /**Дата получения кредита*/
    private LocalDate dateReceiptLoan;

    /**
     * Главный конструктор класса
     * @param loanAmount Сумма кредита
     * @param interestRate Процентная ставка
     * @param loanTermInMonths Срок кредита в месяцах
     * @param dateReceiptLoan Дата получения кредита
     */
    public CreditProduct(@Size(min = 0) double loanAmount, @Size(min = 0) double interestRate,
                         @Size(min = 0) int loanTermInMonths, LocalDate dateReceiptLoan) {
        this.loanAmount = loanAmount;
        this.interestRate = interestRate;
        this.loanTermInMonths = loanTermInMonths;
        this.dateReceiptLoan = dateReceiptLoan;
    }
}
