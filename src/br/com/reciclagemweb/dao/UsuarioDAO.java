package br.com.reciclagemweb.dao;

import br.com.reciclagemweb.business.entity.Usuario;

public interface UsuarioDAO extends GenericDAO<Usuario>{
	
	Usuario getPorLogin(String login);
	
}