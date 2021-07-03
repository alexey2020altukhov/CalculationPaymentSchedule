package com.spring.repositories;

import com.spring.entities.PaymentSchedule;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;
import java.util.UUID;

/**
 * Репозиторий к таблице "Графики платежей"
 * @author Altukhov Alexey
 * @version 1.0
 */
public interface PaymentScheduleRepository extends JpaRepository<PaymentSchedule, UUID>{

    /**
     * Метод для поиска графика платежей по id графика платежей
     * @param idPaymentSchedule Id графика платежей
     * @return Возвращает график платежей
     */
    PaymentSchedule findByIdPaymentSchedule(UUID idPaymentSchedule);

    /**
     * Метод для поиска графика платежей по id клиента
     * @param idClient Id клиента
     * @return Возврашает график платежей
     */
    PaymentSchedule findByIdClient(UUID idClient);

    /**
     * Метод для поиска графика платежей по id кредитного продукта
     * @param idCreditProduct Id кредитного продукта
     * @return Возвращает график платежей
     */
    PaymentSchedule findByIdCreditProduct(UUID idCreditProduct);

    /**
     * Метод для поиска графика платежей по его id и id клиента
     * @param idPaymentSchedule Id графика платежей
     * @param idClient Id клиента
     * @return Возвращает график платежей
     */
    PaymentSchedule findByIdPaymentScheduleAndIdClient(UUID idPaymentSchedule, UUID idClient);

    /**
     * Метод для поиска графика платежей по его id и id кредитного продукта
     * @param idPaymentSchedule Id графика платежей
     * @param idCreditProduct Id кредитного продукта
     * @return Возвращает график платежей
     */
    PaymentSchedule findByIdPaymentScheduleAndIdCreditProduct(UUID idPaymentSchedule, UUID idCreditProduct);

    /**
     * Метод для поиска графика платежей по id клиента и id кредитного продукта
     * @param idClient Id клиента
     * @param idCreditProduct Id кредитного продукта
     * @return Возвращает график платежей
     */
    PaymentSchedule findByIdClientAndIdCreditProduct(UUID idClient, UUID idCreditProduct);

    /**
     * Метод для поиска графика платежей по его id, а также по id клиента и id кредитного продукта
     * @param idPaymentSchedule Id графика платежей
     * @param idClient Id клиента
     * @param idCreditProduct Id кредитного продукта
     * @return Возвращает график платежей
     */
    PaymentSchedule findByIdPaymentScheduleAndIdClientAndIdCreditProduct(UUID idPaymentSchedule, UUID idClient, UUID idCreditProduct);

    /**
     * Метод для получения n-го количества графиков платежей по id графика платежей
     * @param idPaymentSchedule Id графика платежей
     * @param pageable Объект для задания количества возвращаемых записей
     * @return Возвращает список n-го количества графиков платежей
     */
    ArrayList<PaymentSchedule> findAllByIdPaymentSchedule(UUID idPaymentSchedule, Pageable pageable);

    /**
     * Метод для получения n-го количества графиков платежей по id клиента
     * @param idClient Id клиента
     * @param pageable Объект для задания количества возвращаемых записей
     * @return Возвращает список n-го количества графиков платежей
     */
    ArrayList<PaymentSchedule> findAllByIdClient(UUID idClient, Pageable pageable);

    /**
     * Метод для получения n-го количества графиков платежей по id кредитного продукта
     * @param idCreditProduct Id кредитного продукта
     * @param pageable Объект для задания количества возвращаемых записей
     * @return Возвращает список n-го количества графиков платежей
     */
    ArrayList<PaymentSchedule> findAllByIdCreditProduct(UUID idCreditProduct, Pageable pageable);

    /**
     * Метод для получения n-го количества графиков платежей по id графика платежей и id клиента
     * @param idPaymentSchedule Id графика платежей
     * @param idClient Id клиента
     * @param pageable Объект для задания количества возвращаемых записей
     * @return Возвращает список n-го количества графиков платежей
     */
    ArrayList<PaymentSchedule> findAllByIdPaymentScheduleAndIdClient(UUID idPaymentSchedule, UUID idClient, Pageable pageable);

    /**
     * Метод для получения n-го количества графиков платежей по id графика платежей и id кредитного продукта
     * @param idPaymentSchedule Id графика платежей
     * @param idCreditProduct Id кредитного продукта
     * @param pageable Объект для задания количества возвращаемых записей
     * @return Возвращает список n-го количества графиков платежей
     */
    ArrayList<PaymentSchedule> findAllByIdPaymentScheduleAndIdCreditProduct(UUID idPaymentSchedule, UUID idCreditProduct, Pageable pageable);

    /**
     * Метод для получения n-го количества графиков платежей по id клиента и id кредитного продукта
     * @param idClient Id клиента
     * @param idCreditProduct Id кредитного продукта
     * @param pageable Объект для задания количества возвращаемых записей
     * @return Возвращает список n-го количества графиков платежей
     */
    ArrayList<PaymentSchedule> findAllByIdClientAndIdCreditProduct(UUID idClient, UUID idCreditProduct, Pageable pageable);

    /**
     * Метод для получения n-го количества графиков платежей по id графика платежей, id клиента и id кредитного продукта
     * @param idPaymentSchedule Id графика платежей
     * @param idClient Id клиента
     * @param idCreditProduct Id кредитного продукта
     * @param pageable Объект для задания количества возвращаемых записей
     * @return Возвращает список n-го количества графиков платежей
     */
    ArrayList<PaymentSchedule> findAllByIdPaymentScheduleAndIdClientAndIdCreditProduct(UUID idPaymentSchedule, UUID idClient, UUID idCreditProduct, Pageable pageable);
}
