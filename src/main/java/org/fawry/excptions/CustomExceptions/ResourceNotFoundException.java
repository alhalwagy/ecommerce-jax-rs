package org.fawry.excptions.CustomExceptions;


import jakarta.ws.rs.WebApplicationException;

public class ResourceNotFoundException extends WebApplicationException {
    public ResourceNotFoundException(String message) {
        super(message);
    }

    public ResourceNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public ResourceNotFoundException(Throwable cause) {
        super(cause);
    }
}