package com.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Главный класс, запускающий приложение
 * @author Altukhov Alexey
 * @version 1.0
 */
@SpringBootApplication
public class Application {

    /**
     * Главная процедура, запускаемая при старте программы
     * @param args - обязательный параметр
     */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
