package br.com.reciclagemweb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.reciclagemweb.business.dto.DescarteDTO;
import br.com.reciclagemweb.business.entity.Produto;
import br.com.reciclagemweb.business.entity.ProdutoDescarte;
import br.com.reciclagemweb.business.entity.TipoDescarte;
import br.com.reciclagemweb.business.entity.Usuario;
import br.com.reciclagemweb.dao.ProdutoDescarteDAO;
import br.com.reciclagemweb.service.ProdutoDescarteService;

@Service
public class ProdutoDescarteServiceImpl extends GenericServiceImpl<ProdutoDescarte, ProdutoDescarteDAO> implements ProdutoDescarteService {
	
	@Autowired
	public ProdutoDescarteServiceImpl(ProdutoDescarteDAO produtoDescarteDao){
		this.setDefaultDAO(produtoDescarteDao);
	}

	@Override
	public void descarte(DescarteDTO descarteDto) {
		
		ProdutoDescarte descarte = new ProdutoDescarte();
		
		descarte.setMotivo(descarteDto.getMotivo());
		Produto produto = new Produto();
		produto.setId(descarteDto.getIdProduto());
		descarte.setProduto(produto);
		descarte.setQuantidade(descarteDto.getQuantidade());
		TipoDescarte tipoDescarte = new TipoDescarte();
		tipoDescarte.setId(descarteDto.getIdTipoDescarte());
		descarte.setTipoDescarte(tipoDescarte);
		Usuario usuario = new Usuario();
		usuario.setId(descarteDto.getIdUsuario());
		descarte.setUsuario(usuario);
		
        try {
			getDao().adicionar(descarte);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}