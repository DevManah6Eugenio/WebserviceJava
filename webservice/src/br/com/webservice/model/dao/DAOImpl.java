package br.com.webservice.model.dao;

import java.util.List;

public interface DAOImpl<T> {

    public List<T> getAll();

    public T getById(long id);

    public T save(T objeto);

    public T update(T objeto);

    public T delete(Long id);
}