package br.com.reciclagemweb.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
		descarte.setDescarte(new Date());
		
        try {
			getDao().adicionar(descarte);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<DescarteDTO> listDescarteDTO() {
		
		List<ProdutoDescarte> descartes = getDao().list();		
		List<DescarteDTO> descartesDto = new ArrayList<DescarteDTO>();
		
		for(ProdutoDescarte descarte: descartes){
			DescarteDTO descarteDto = new DescarteDTO();
			descarteDto.setDescricaoProduto(descarte.getProduto().getProduto());
			descarteDto.setDescricaoTipoDescarte(descarte.getTipoDescarte().getNome());
			descarteDto.setMotivo(descarte.getMotivo());
			descarteDto.setQuantidade(descarte.getQuantidade());
			
			descartesDto.add(descarteDto);
		}
		
		return descartesDto;
	}
	
}