package com.personal.app.shared.responses;

public class Created<T> extends Response<T> {

    public Created(T data) {
        super(data, 201);
    }

    @Override
    public Boolean isOk() {
        return true;
    }
}
