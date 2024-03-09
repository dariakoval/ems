package org.aston.ems.common_lib.exception.web;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class ApiError {

    private static final DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
    private final String timestamp = LocalDateTime.now().format(dateFormatter);
    private String message;

    public ApiError(String message) {
        this.message = message;
    }
}