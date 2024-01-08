package br.dev.joaoguilherme.basicapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.io.Serial;

/**
 * Quando falha uma chamada para um serviço externo.
 */
@ResponseStatus(value = HttpStatus.BAD_GATEWAY)
public class ExternalServiceException extends RuntimeException {
    @Serial
    private static final long serialVersionUID = 1679768946405686678L;

    public ExternalServiceException(String message) {
        super(message);
    }
}
    