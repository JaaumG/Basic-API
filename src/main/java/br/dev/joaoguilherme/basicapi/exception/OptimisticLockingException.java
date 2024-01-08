package br.dev.joaoguilherme.basicapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.io.Serial;

/**
 * Quando ocorre um conflito de versão em uma operação de atualização de entidade.
 */
@ResponseStatus(value = HttpStatus.CONFLICT)
public class OptimisticLockingException extends RuntimeException {
    @Serial
    private static final long serialVersionUID = -7140942960998423137L;

    public OptimisticLockingException(String message) {
        super(message);
    }
}
    