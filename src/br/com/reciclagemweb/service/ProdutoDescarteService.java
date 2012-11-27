package br.com.reciclagemweb.service;

import java.util.List;

import br.com.reciclagemweb.business.dto.DescarteDTO;
import br.com.reciclagemweb.business.entity.ProdutoDescarte;

public interface ProdutoDescarteService extends GenericService<ProdutoDescarte> {
	
	void descarte(DescarteDTO descarteDto);
	
	List<DescarteDTO> listDescarteDTO();
	
}
