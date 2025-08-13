package com.devlucas.desafio_cliente.dto;

import java.time.Instant;

public class CustomError {
    private Instant timesTamp;
    private Integer status;
    private String error;
    private String path;

    public CustomError(Instant timesTamp, Integer status, String error, String path) {
        this.timesTamp = timesTamp;
        this.status = status;
        this.error = error;
        this.path = path;
    }

    public Instant getTimesTamp() {
        return timesTamp;
    }

    public String getPath() {
        return path;
    }

    public String getError() {
        return error;
    }

    public Integer getStatus() {
        return status;
    }
}
