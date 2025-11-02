package com.lovestoblog.vitornatal.domainshop.exception;

import feign.FeignException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class FeignExceptionHandler {
    @ExceptionHandler(InvalidTldException.class)
    public ResponseEntity<String> handleInvalidTld(InvalidTldException ex) {
        return ResponseEntity.badRequest().body(ex.getMessage());
    }

    @ExceptionHandler(FeignException.class)
    public ResponseEntity<String> handleFeign(FeignException ex) {
        if (ex.status() == 404) {
            return ResponseEntity.ok("Domain available");
        }
        return ResponseEntity.status(ex.status()).body("Error");
    }
}
