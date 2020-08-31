package test.task.eco_bike.service;

import java.util.List;

public interface BikeService<T, R> {
    T add(T t);

    T getByParams(R r);

    List<T> getAll();
}
