package test.task.eco_bike.service;

public interface BikeService<T, R> {
    T add(T t);

    T getByParams(R r);

    T getAll();
}
