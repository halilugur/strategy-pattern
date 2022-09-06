package com.ugurhalil.strategypattern.strategy.exception;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ExceptionResponseDto {
    private String message;
    private HttpStatus status;
}
