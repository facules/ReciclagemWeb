package br.com.reciclagemweb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import br.com.reciclagemweb.business.entity.Produto;
import br.com.reciclagemweb.dao.ProdutoDAO;
import br.com.reciclagemweb.service.ProdutoService;

@Service
public class ProdutoServiceImpl extends GenericServiceImpl<Produto, ProdutoDAO> implements ProdutoService {
	
	@Autowired
	public ProdutoServiceImpl(ProdutoDAO produtoDao){
		this.setDefaultDAO(produtoDao);
	}
}