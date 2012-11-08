package br.com.reciclagemweb.business.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ProdutoDescarte implements Serializable {

	
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private int id;
	
	private int id_usuario;
	
	private int id_produto;
	
	private Date descarte;
	
	private int id_tipo_descarte;
	
	private double quantidade;
	
	private String motivo;
	
	
}
