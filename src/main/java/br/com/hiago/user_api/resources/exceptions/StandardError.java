package br.com.hiago.user_api.resources.exceptions;

import java.time.LocalDateTime;


public class StandardError {

    private LocalDateTime timestamp;
    private String error;
    private Integer status;
    private String path;

    public StandardError(LocalDateTime timestamp, String error, Integer status, String path) {
        this.timestamp = timestamp;
        this.error = error;
        this.status = status;
        this.path = path;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public String getError() {
        return error;
    }

    public Integer getStatus() {
        return status;
    }

    public String getPath() {
        return path;
    }
}
