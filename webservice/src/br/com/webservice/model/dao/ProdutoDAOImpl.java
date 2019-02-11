package br.com.webservice.model.dao;

import java.util.List;

public interface ProdutoDAOImpl<T> extends DAOImpl<T> {

    public List<T> getByPagination(int firstResult, int maxResults);

    public List<T> getByName(String name);

}
