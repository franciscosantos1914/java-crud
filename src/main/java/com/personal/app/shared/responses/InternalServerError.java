package com.personal.app.shared.responses;

public class InternalServerError<T> extends Response<T> {

    public InternalServerError(T data) {
        super(data, 500);
    }

    @Override
    public Boolean isOk() {
        return false;
    }
}
