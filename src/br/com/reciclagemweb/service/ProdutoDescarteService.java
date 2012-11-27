package br.com.reciclagemweb.service;

import br.com.reciclagemweb.business.dto.DescarteDTO;
import br.com.reciclagemweb.business.entity.ProdutoDescarte;

public interface ProdutoDescarteService extends GenericService<ProdutoDescarte> {
	
	void descarte(DescarteDTO descarteDto);
	
}
