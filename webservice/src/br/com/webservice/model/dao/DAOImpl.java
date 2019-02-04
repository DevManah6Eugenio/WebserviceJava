package br.com.webservice.model.dao;

import java.util.List;

public interface DAOImpl {

    public List<Object> getAll();

    public Object getById(long id);

    public Object save(Object obj);

    public Object update(Object obj);

    public Object delete(Long id);
}
