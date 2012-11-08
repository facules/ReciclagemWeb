package br.com.reciclagemweb.dao;

import java.util.List;

public interface GenericDAO<T> {

	void adicionar(T entidade) throws Exception;
	void alterar(T entidade)throws Exception;
	void deletar(T entidade) throws Exception;
	List<T> list();
	T buscar(final long id);
}
