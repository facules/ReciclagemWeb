package br.com.reciclagemweb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.reciclagemweb.dao.GenericDAO;
import br.com.reciclagemweb.service.GenericService;

public class GenericServiceImpl<T, DAO> implements GenericService<T>{

	private Class<DAO> klassDAO;
	
	private GenericDAO<T> dao;
	
	public void setDefaultDAO(GenericDAO<T> dao) {
		this.dao = dao;
		this.klassDAO = (Class<DAO>) dao.getClass();
	}
	
	public DAO getDao() {
		return klassDAO.cast(dao);
	}
	
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
	public T buscar(Integer id) {
		// TODO Auto-generated method stub
		return (T) dao.buscar(id);
	}

}
