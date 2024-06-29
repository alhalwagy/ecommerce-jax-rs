package org.fawry.model.errors;

import java.sql.Timestamp;

public class ResponseErrorModel {

    private int status;
    private String message;
    private Timestamp occurredAt;

    public ResponseErrorModel() {
    }

    public ResponseErrorModel(int status, String message, Timestamp occuredAt) {
        this.status = status;
        this.message = message;
        this.occurredAt = occuredAt;
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

    public Timestamp getOccurredAt() {
        return occurredAt;
    }

    public void setOccurredAt(Timestamp occurredAt) {
        this.occurredAt = occurredAt;
    }

    @Override
    public String toString() {
        return "ResponseErrorModel{" +
                "status=" + status +
                ", message='" + message + '\'' +
                ", occurredAt=" + occurredAt +
                '}';
    }
}
