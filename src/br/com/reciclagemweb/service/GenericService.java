package br.com.reciclagemweb.service;

import java.util.List;

public interface GenericService<T>{

	void adicionar(T entidade) throws Exception;
	void alterar(T entidade)throws Exception;
	void deletar(T entidade) throws Exception;
	List<T> list();
	T buscar(final long id);
}
