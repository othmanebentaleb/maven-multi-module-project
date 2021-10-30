package org.school.project.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class EtudiantNotFoundException extends RuntimeException {

    public EtudiantNotFoundException(String s) {
        super(s);
    }
}