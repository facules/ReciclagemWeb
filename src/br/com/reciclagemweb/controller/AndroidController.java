package br.com.reciclagemweb.controller;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.view.Results;
import br.com.reciclagemweb.business.dto.DescarteDTO;
import br.com.reciclagemweb.business.entity.Usuario;
import br.com.reciclagemweb.service.ProdutoDescarteService;
import br.com.reciclagemweb.service.ProdutoService;
import br.com.reciclagemweb.service.TipoDescarteService;
import br.com.reciclagemweb.service.UsuarioService;

@Resource
public class AndroidController {
	
	private Result result;
	
	@Autowired
	private ProdutoService produtoService;
	
	@Autowired
	private ProdutoDescarteService produtoDescarteService;
	
	@Autowired
	private TipoDescarteService tipoDescarteService;
	
	@Autowired
	private UsuarioService usuarioService;
	
	public AndroidController(Result  result) {
		this.result = result;
	}
	
	public void usuarioPorLogin(String login){
		Usuario usuario  = usuarioService.getPorLogin(login);
		if(usuario != null){
			result.use(Results.json()).withoutRoot().from(usuarioService.getPorLogin(login)).recursive().serialize();
		}
		else{
			result.use(Results.json()).withoutRoot().from("NULL").recursive().serialize();
		}
	}
	
	public void listaDeItens(){
		result.use(Results.json()).withoutRoot().from(produtoService.list()).recursive().serialize();
	}
	
	public void listaDeDescartes(){
		result.use(Results.json()).withoutRoot().from(produtoDescarteService.list()).serialize();
	}
	
	public void listaTipoDescarte(){
		result.use(Results.json()).withoutRoot().from(tipoDescarteService.list()).serialize();
	}
	
	public void descarte(DescarteDTO descarteDto){
		System.out.println(descarteDto.getIdUsuario());
		produtoDescarteService.descarte(descarteDto);
	}

}
