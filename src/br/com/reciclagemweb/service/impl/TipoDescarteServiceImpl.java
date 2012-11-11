package br.com.reciclagemweb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.reciclagemweb.business.entity.TipoDescarte;
import br.com.reciclagemweb.dao.TipoDescarteDAO;
import br.com.reciclagemweb.service.TipoDescarteService;

@Service
public class TipoDescarteServiceImpl extends GenericServiceImpl<TipoDescarte, TipoDescarteDAO> implements TipoDescarteService {
	
	@Autowired
	public TipoDescarteServiceImpl(TipoDescarteDAO tipoDescarteDao){
		this.setDefaultDAO(tipoDescarteDao);
	}
}