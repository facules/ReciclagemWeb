package br.com.reciclagemweb.controller;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.caelum.vraptor.Resource;
import br.com.reciclagemweb.business.entity.Produto;
import br.com.reciclagemweb.business.entity.ProdutoDescarte;
import br.com.reciclagemweb.business.entity.TipoDescarte;
import br.com.reciclagemweb.business.entity.Usuario;
import br.com.reciclagemweb.service.ProdutoDescarteService;
import br.com.reciclagemweb.service.ProdutoService;
import br.com.reciclagemweb.service.TipoDescarteService;
import br.com.reciclagemweb.service.UsuarioService;

@Resource
public class InicioController {

	@Autowired
	private ProdutoService produtoService;
	
	@Autowired
	private ProdutoDescarteService produtoDescarteService;
	
	@Autowired
	private TipoDescarteService tipoDescarteService;
	
	@Autowired
	private UsuarioService usuarioService;
	
	public void hello(){
		System.out.println("Ola Mundo!");
	}
	
	public void testarProduto(){
		Produto produto = new Produto();
		produto.setCodigo(1);
		produto.setDescricao("placa mae danificada");
		produto.setProduto("placa mae");
		
		try {
			produtoService.adicionar(produto);
			System.out.println("produto: "+produto.getId());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void testarTipoDescarte(){
		TipoDescarte tipoDescarte = new TipoDescarte();
		tipoDescarte.setNome("Morreu");
		tipoDescarte.setDescricao("Morreu de morte morrida!");
		
		try {
			tipoDescarteService.adicionar(tipoDescarte);
			System.out.println("tipoDescarte: "+tipoDescarte.getId());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void testarUsuario(){
		Usuario usuario = new Usuario();
		usuario.setLogin("login");
		usuario.setNome("Nome");
		usuario.setSenha("senha");
		usuario.setSobrenome("sobrenome");
		
		try {
			usuarioService.adicionar(usuario);
			System.out.println("usuario: "+usuario.getId());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void testarProdutoDescarte(){
		ProdutoDescarte produtoDescarte = new ProdutoDescarte();
		Produto produto = new Produto();
		produto.setId(1);
		produtoDescarte.setProduto(produto);
		produtoDescarte.setMotivo("Monho!");
		produtoDescarte.setDescarte(Calendar.getInstance().getTime());
		produtoDescarte.setQuantidade(5);
		Usuario usuario = new Usuario();
		usuario.setId(1);
		produtoDescarte.setUsuario(usuario);
		TipoDescarte tipoDescarte = new TipoDescarte();
		tipoDescarte.setId(1);
		produtoDescarte.setTipoDescarte(tipoDescarte);
		
		try {
			produtoDescarteService.adicionar(produtoDescarte);
			System.out.println("produtoDescarte: "+produtoDescarte.getId());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}