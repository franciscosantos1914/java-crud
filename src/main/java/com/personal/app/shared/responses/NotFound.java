package com.personal.app.shared.responses;

public class NotFound<T> extends Response<T> {

    public NotFound(T data) {
        super(data, 404);
    }

    @Override
    public Boolean isOk() {
        return false;
    }
}
