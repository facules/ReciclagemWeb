package br.com.reciclagemweb.dao.hibernate;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.com.reciclagemweb.business.entity.Produto;
import br.com.reciclagemweb.dao.ProdutoDAO;

@Repository
public class HibernateProdutoDAO extends HibernateGenericDAO<Produto> implements ProdutoDAO {

	@Autowired
	public HibernateProdutoDAO(	SessionFactory sessionfactory) {
		super(Produto.class, sessionfactory);
		// TODO Auto-generated constructor stub
	}

}
