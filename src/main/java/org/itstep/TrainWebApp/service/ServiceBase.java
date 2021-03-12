package org.itstep.TrainWebApp.service;

public interface ServiceBase<T, I> {
    void save(T t);

    T update(T t);

    void delete(I id);

    T getById(I id);
}
