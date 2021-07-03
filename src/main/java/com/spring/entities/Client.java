package com.spring.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.UUID;

/**
 * Сущность для таблицы "Клиенты"
 * @author Altukhov Alexey
 * @version 1.0
 */
@Data
@NoArgsConstructor
@Entity
public class Client {

    /**Id клиента*/
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(length=16)
    private UUID idClient;
    /**Имя*/
    @Size(min = 2, max = 100)
    private String name;
    /**Фамилия*/
    @Size(min = 2, max = 100)
    private String surname;
    /**Отчество*/
    @Size(min = 2, max = 100)
    private String middleName;
    /**Номер телефона*/
    @Pattern(regexp="/^(\\s*)?(\\+)?([- _():=+]?\\d[- _():=+]?){10,14}(\\s*)?$/")
    private String phoneNumber;

    /**
     * Главный конструктор класса
     * @param name Имя клиента
     * @param surname Фамилия клиента
     * @param middleName Отчество клиента
     * @param phoneNumber Номер телефона клиента
     */
    public Client(@Size(min = 2, max = 100) String name, @Size(min = 2, max = 100) String surname,
                  @Size(min = 2, max = 100) String middleName, @Pattern(regexp = "/^(\\s*)?(\\+)?([- _():=+]?\\d[- _():=+]?){10,14}(\\s*)?$/") String phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.middleName = middleName;
        this.phoneNumber = phoneNumber;
    }
}
