package com.personal.app.shared.responses;

public class Ok<T> extends Response<T> {

    public Ok(T data) {
        super(data, 200);
    }

    @Override
    public Boolean isOk() {
        return true;
    }
}
