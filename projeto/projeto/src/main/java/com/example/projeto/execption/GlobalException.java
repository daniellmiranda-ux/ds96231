package com.example.projeto.execption;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Map;
import java.util.Objects;

@RestControllerAdvice
public class GlobalException {
    @ExceptionHandler(IllegalAccessException.class)
    public ResponseEntity<Map<String, Object>> IllegalArgumentException(IllegalAccessException erro){
        return ResponseEntity
                .status(HttpStatus.CONFLICT)
                .body(Map.of("mensagem",erro.getMessage()));
    }
}
