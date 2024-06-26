package org.fawry.model.errors;

import java.sql.Timestamp;

public class ResponseErrorModel {

    private int status;
    private String message;
    private Timestamp occuredAt;

    public ResponseErrorModel() {
    }

    public ResponseErrorModel(int status, String message, Timestamp occuredAt) {
        this.status = status;
        this.message = message;
        this.occuredAt = occuredAt;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Timestamp getOccuredAt() {
        return occuredAt;
    }

    public void setOccuredAt(Timestamp occuredAt) {
        this.occuredAt = occuredAt;
    }
}
