package br.com.reciclagemweb.business.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_produto_descarte")
public class ProdutoDescarte implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;

	@ManyToOne
	@JoinColumn(name="id_usuario")
	private Usuario usuario;
	
	@ManyToOne
	@JoinColumn(name="id_produto")
	private Produto produto;
	
	@ManyToOne
	@JoinColumn(name="id_tipo_descarte")
	private TipoDescarte tipoDescarte;
	
	@Column(name="dt_descarte")
	private Date descarte;
	
	@Column(name="qtde_descarte")
	private Integer quantidade;
	
	@Column(name="ds_motivo", columnDefinition="TEXT")
	private String motivo;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public TipoDescarte getTipoDescarte() {
		return tipoDescarte;
	}

	public void setTipoDescarte(TipoDescarte tipoDescarte) {
		this.tipoDescarte = tipoDescarte;
	}

	public Date getDescarte() {
		return descarte;
	}

	public void setDescarte(Date descarte) {
		this.descarte = descarte;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}