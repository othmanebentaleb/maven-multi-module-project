package org.school.project.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class EtudiantExistsException extends RuntimeException {
    public EtudiantExistsException(String message) {
        super(message);
    }
}
