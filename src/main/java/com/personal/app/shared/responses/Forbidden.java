package com.personal.app.shared.responses;

public class Forbidden<T> extends Response<T> {

    public Forbidden(T data) {
        super(data, 403);
    }

    @Override
    public Boolean isOk() {
        return false;
    }
}
