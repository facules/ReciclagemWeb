package br.com.reciclagemweb.dao.hibernate;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.com.reciclagemweb.business.entity.ProdutoDescarte;
import br.com.reciclagemweb.dao.ProdutoDescarteDAO;

@Repository(value="produtoDescarteDao")
public class HibernateProdutoDescarteDAO extends HibernateGenericDAO<ProdutoDescarte> implements ProdutoDescarteDAO {

	@Autowired
	public HibernateProdutoDescarteDAO(	SessionFactory sessionfactory) {
		super(ProdutoDescarte.class, sessionfactory);
	}
}