package br.com.reciclagemweb.service;

import br.com.reciclagemweb.business.entity.Usuario;

public interface UsuarioService extends GenericService<Usuario> {
	
	Usuario getPorLogin(String login);
	
}