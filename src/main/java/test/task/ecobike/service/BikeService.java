package test.task.ecobike.service;

import java.util.List;

public interface BikeService<T, R> {
    T add(T t);

    List<T> getByParams(R r);

    List<T> getAll();
}
