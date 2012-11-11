package br.com.reciclagemweb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import br.com.reciclagemweb.business.entity.ProdutoDescarte;
import br.com.reciclagemweb.dao.ProdutoDAO;
import br.com.reciclagemweb.dao.ProdutoDescarteDAO;
import br.com.reciclagemweb.service.ProdutoDescarteService;

@Service
public class ProdutoDescarteServiceImpl extends GenericServiceImpl<ProdutoDescarte, ProdutoDescarteDAO> implements ProdutoDescarteService {
	
	@Autowired
	public ProdutoDescarteServiceImpl(ProdutoDescarteDAO produtoDescarteDao){
		this.setDefaultDAO(produtoDescarteDao);
	}
}
