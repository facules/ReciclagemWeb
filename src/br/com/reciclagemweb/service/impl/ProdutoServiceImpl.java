package br.com.reciclagemweb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.reciclagemweb.business.entity.Produto;
import br.com.reciclagemweb.dao.ProdutoDAO;
import br.com.reciclagemweb.service.ProdutoService;

@Service
public class ProdutoServiceImpl extends GenericServiceImpl<Produto> implements ProdutoService {
	
	private ProdutoDAO produtodao;
	@Autowired
	public ProdutoServiceImpl(ProdutoDAO produtodao){
		this.produtodao=produtodao;
	}
	
}
