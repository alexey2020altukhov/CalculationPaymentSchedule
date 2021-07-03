package com.spring.services;

import com.spring.entities.Client;
import com.spring.entities.CreditProduct;
import com.spring.entities.PaymentSchedule;
import com.spring.repositories.ClientRepository;
import com.spring.repositories.CreditProductRepository;
import com.spring.repositories.PaymentScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.UUID;

/**
 * Сервис для работы с различными запросами
 * @author Altukhov Alexey
 * @version 1.0
 */
@Service
public class MainService {

    /**Репозиторий к таблице "Клиенты"*/
    @Autowired
    private ClientRepository clientRepository;
    /**Репозиторий к таблице "Кредитные продукты"*/
    @Autowired
    private CreditProductRepository creditProductRepository;
    /**Репозиторий к таблице "Графики платежей"*/
    @Autowired
    private PaymentScheduleRepository paymentScheduleRepository;

    /**
     * Метод для сохранения клиента в базу данных
     * @param name Имя клиента
     * @param surname Фамилия клиента
     * @param middleName Отчество клиента
     * @param phoneNumber Номер телефона
     */
    public void saveClient(String name, String surname, String middleName, String phoneNumber) {
        clientRepository.save(new Client(name, surname, middleName, phoneNumber));
    }

    /**
     * Метод для сохранения кредитного продукта в базу данных
     * @param loanAmount Сумма кредита
     * @param interestRate Процентная ставка
     * @param loanTermInMonths Срок кредита в месяцах
     * @param dateReceiptLoan Дата получения кредита
     */
    public void saveCreditProduct(double loanAmount, double interestRate, int loanTermInMonths, LocalDate dateReceiptLoan) {
        creditProductRepository.save(new CreditProduct(loanAmount, interestRate, loanTermInMonths, dateReceiptLoan));
    }

    /**
     * Метод для получения графика платежей по его id
     * @param idPaymentSchedule Id графика платежей
     * @return Возвращает график платежей
     */
    public PaymentSchedule getPaymentScheduleByIdPaymentSchedule(UUID idPaymentSchedule) {
        return paymentScheduleRepository.findByIdPaymentSchedule(idPaymentSchedule);
    }

    /**
     * Метод для получения графика платежей по id клиента
     * @param idClient Id клиента
     * @return Возвращает график платежей
     */
    public PaymentSchedule getPaymentScheduleByIdClient(UUID idClient) {
        return paymentScheduleRepository.findByIdClient(idClient);
    }

    /**
     * Метод для получения графика платежей по id кредитного продукта
     * @param idCreditProduct Id кредитного продукта
     * @return Возвращает график платежей
     */
    public PaymentSchedule getPaymentScheduleByIdCreditProduct(UUID idCreditProduct) {
        return paymentScheduleRepository.findByIdCreditProduct(idCreditProduct);
    }

    /**
     * Метод для получения графика платежей по id графика платежей и id клиента
     * @param idPaymentSchedule Id графика платежей
     * @param idClient Id клиента
     * @return Возвращает график платежей
     */
    public PaymentSchedule getPaymentScheduleByIdPaymentScheduleAndIdClient(UUID idPaymentSchedule, UUID idClient) {
        return paymentScheduleRepository.findByIdPaymentScheduleAndIdClient(idPaymentSchedule, idClient);
    }

    /**
     * Метод для получения графика платежей по id графика платежей и id кредитного продукта
     * @param idPaymentSchedule Id графика платежей
     * @param idCreditProduct Id кредитного продукта
     * @return Возвращает график платежей
     */
    public PaymentSchedule getPaymentScheduleByIdPaymentScheduleAndIdCreditProduct(UUID idPaymentSchedule, UUID idCreditProduct) {
        return paymentScheduleRepository.findByIdPaymentScheduleAndIdCreditProduct(idPaymentSchedule, idCreditProduct);
    }

    /**
     * Метод для получения графика платежей по id клиента и id кредитного продукта
     * @param idClient Id клиента
     * @param idCreditProduct Id кредитного продукта
     * @return Возвращает график платежей
     */
    public PaymentSchedule getPaymentScheduleByIdClientAndIdCreditProduct(UUID idClient, UUID idCreditProduct) {
        return paymentScheduleRepository.findByIdClientAndIdCreditProduct(idClient, idCreditProduct);
    }

    /**
     * Метод для получения графика платежей по id графика платежей, id клиента и id кредитного продукта
     * @param idPaymentSchedule Id графика платежей
     * @param idClient Id клиента
     * @param idCreditProduct Id кредитного продукта
     * @return Возвращает график платежей
     */
    public PaymentSchedule getPaymentScheduleByIdPaymentScheduleAndIdClientAndIdCreditProduct(UUID idPaymentSchedule, UUID idClient, UUID idCreditProduct) {
        return paymentScheduleRepository.findByIdPaymentScheduleAndIdClientAndIdCreditProduct(idPaymentSchedule, idClient, idCreditProduct);
    }

    /**
     * Метод для получения n-го количества графиков платежей по id графика платежей
     * @param idPaymentSchedule Id графика платежей
     * @param n Количество записей
     * @return Возвращает список графиков платежей
     */
    public ArrayList<PaymentSchedule> getPaymentSchedulesByIdPaymentSchedule(UUID idPaymentSchedule, int n) {
        Pageable pageable = PageRequest.of(0, n);
        return paymentScheduleRepository.findAllByIdPaymentSchedule(idPaymentSchedule, pageable);
    }

    /**
     * Метод для получения n-го количества графиков платежей по id клиента
     * @param idClient Id клиента
     * @param n Количество записей
     * @return Возвращает список графиков платежей
     */
    public ArrayList<PaymentSchedule> getPaymentSchedulesByIdClient(UUID idClient, int n) {
        Pageable pageable = PageRequest.of(0, n);
        return paymentScheduleRepository.findAllByIdClient(idClient, pageable);
    }

    /**
     * Метод для получения n-го количества графиков платежей по id кредитного продукта
     * @param idCreditProduct Id кредитного продукта
     * @param n Количество записей
     * @return Возвращает список графиков платежей
     */
    public ArrayList<PaymentSchedule> getPaymentSchedulesByIdCreditProduct(UUID idCreditProduct, int n) {
        Pageable pageable = PageRequest.of(0, n);
        return paymentScheduleRepository.findAllByIdCreditProduct(idCreditProduct, pageable);
    }

    /**
     * Метод для получения n-го количества графиков платежей по id графика платежей и id клиента
     * @param idPaymentSchedule Id графика платежей
     * @param idClient Id клиента
     * @param n Количество записей
     * @return Возвращает список графиков платежей
     */
    public ArrayList<PaymentSchedule> getPaymentSchedulesByIdPaymentScheduleAndIdClient(UUID idPaymentSchedule, UUID idClient, int n) {
        Pageable pageable = PageRequest.of(0, n);
        return paymentScheduleRepository.findAllByIdPaymentScheduleAndIdClient(idPaymentSchedule, idClient, pageable);
    }

    /**
     * Метод для получения n-го количества графиков платежей по id графика платежей и id кредитного продукта
     * @param idPaymentSchedule Id графика платежей
     * @param idCreditProduct Id кредитного продукта
     * @param n Количество записей
     * @return Возвращает список графиков платежей
     */
    public ArrayList<PaymentSchedule> getPaymentSchedulesByIdPaymentScheduleAndIdCreditProduct(UUID idPaymentSchedule, UUID idCreditProduct, int n) {
        Pageable pageable = PageRequest.of(0, n);
        return paymentScheduleRepository.findAllByIdPaymentScheduleAndIdCreditProduct(idPaymentSchedule, idCreditProduct, pageable);
    }

    /**
     * Метод для получения n-го количества графиков платежей по id клиента и id кредитного продукта
     * @param idClient Id клиента
     * @param idCreditProduct Id кредитного продукта
     * @param n Количество записей
     * @return Возвращает список графиков платежей
     */
    public ArrayList<PaymentSchedule> getPaymentSchedulesByIdClientAndIdCreditProduct(UUID idClient, UUID idCreditProduct, int n) {
        Pageable pageable = PageRequest.of(0, n);
        return paymentScheduleRepository.findAllByIdClientAndIdCreditProduct(idClient, idCreditProduct, pageable);
    }

    /**
     * Метод для получения n-го количества графиков платежей по id графика платежей, id клиента и id кредитного продукта
     * @param idPaymentSchedule Id графика платежей
     * @param idClient Id клиента
     * @param idCreditProduct Id кредитного продукта
     * @param n Количество записей
     * @return Возвращает список графиков платежей
     */
    public ArrayList<PaymentSchedule> getPaymentSchedulesByIdPaymentScheduleAndIdClientAndIdCreditProduct(UUID idPaymentSchedule, UUID idClient, UUID idCreditProduct, int n) {
        Pageable pageable = PageRequest.of(0, n);
        return paymentScheduleRepository.findAllByIdPaymentScheduleAndIdClientAndIdCreditProduct(idPaymentSchedule, idClient, idCreditProduct, pageable);
    }
}
