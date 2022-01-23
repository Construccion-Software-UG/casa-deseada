package edu.ug.model.dao;

import java.util.List;

public interface CrudDAO<T> {

    void insertar(T obj);

    void actualizar(T obj);

    void eliminar(T obj);

    List<T> consultarTodo();

    T consultarPorId(int id);
}
