package com.personal.app.shared.interfaces;

import com.personal.app.shared.responses.Response;

public interface IRepository {
    public <T> Response<T> delete(String id);
    public <T> Response<T> getAll(String id);
    public <T> Response<T> getById(String id);
    public <T> Response<T> create(Object data);
    public <T> Response<T> update(String id, Object data);
}
