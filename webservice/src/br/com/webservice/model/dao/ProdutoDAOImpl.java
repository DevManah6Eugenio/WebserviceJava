package br.com.webservice.model.dao;

import java.util.List;

import br.com.webservice.model.domian.Produto;

public interface ProdutoDAOImpl extends DAOImpl<Produto> {

	public List<Produto> getByPagination(int firstResult, int maxResults);
	
	public List<Produto> getByName(String name);

}
