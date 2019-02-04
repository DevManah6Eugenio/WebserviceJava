package br.com.webservice.model.dao;

import br.com.webservice.model.domian.Produto;
import java.util.List;

public interface ProdutoDAOImpl {

    public List<Produto> getAll();

    public Produto getById(long id);

    public Produto save(Produto produto);

    public Produto update(Produto produto);

    public Produto delete(Long id);
}
