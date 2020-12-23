package com.codegym.repositories;

import java.util.List;

public interface Repository<T> {
    List<T> findAll();

    T findById(Long id);

    void save(T obj);

    void remove(Long id);
}
