package br.com.reciclagemweb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.reciclagemweb.business.entity.Usuario;
import br.com.reciclagemweb.dao.UsuarioDAO;
import br.com.reciclagemweb.service.UsuarioService;

@Service
public class UsuarioServiceImpl extends GenericServiceImpl<Usuario, UsuarioDAO> implements UsuarioService {
	
	@Autowired
	public UsuarioServiceImpl(UsuarioDAO usuarioDao){
		this.setDefaultDAO(usuarioDao);
	}

	@Override
	public Usuario getPorLogin(String login) {
		return getDao().getPorLogin(login);
	}
}