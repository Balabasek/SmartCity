package dao;


import java.util.List;

public interface GenericDao<T> {
    void create(T object);
    void update(T object);
    void delete(T object);
    List<T> findAll();
}
