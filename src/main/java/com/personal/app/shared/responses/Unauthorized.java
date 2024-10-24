package com.personal.app.shared.responses;

public class Unauthorized<T> extends Response<T> {

    public Unauthorized(T data) {
        super(data, 401);
    }

    @Override
    public Boolean isOk() {
        return false;
    }
}
