package br.com.reciclagemweb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.reciclagemweb.business.entity.Produto;
import br.com.reciclagemweb.dao.GenericDAO;
import br.com.reciclagemweb.service.GenericService;

@Service
public class GenericServiceImpl<T> implements GenericService<T>{

	@Autowired
	private GenericDAO dao;
	
	@Override
	public void adicionar(T entidade) throws Exception {
		// TODO Auto-generated method stub
		dao.adicionar(entidade);
	}

	@Override
	public void alterar(T  entidade) throws Exception {
		// TODO Auto-generated method stub
		dao.alterar(entidade);
	}

	@Override
	public void deletar(T  entidade) throws Exception {
		// TODO Auto-generated method stub
		dao.deletar(entidade);
		
	}

	@Override
	public List<T> list() {
		// TODO Auto-generated method stub
	
		return 	dao.list();
	}

	@Override
	public T buscar(long id) {
		// TODO Auto-generated method stub
		return (T) dao.buscar(id);
	}

}
