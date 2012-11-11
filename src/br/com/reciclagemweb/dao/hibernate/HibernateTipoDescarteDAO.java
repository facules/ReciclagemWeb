package br.com.reciclagemweb.dao.hibernate;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.com.reciclagemweb.business.entity.TipoDescarte;
import br.com.reciclagemweb.dao.TipoDescarteDAO;

@Repository(value="tipoDescarteDao")
public class HibernateTipoDescarteDAO extends HibernateGenericDAO<TipoDescarte> implements TipoDescarteDAO {

	@Autowired
	public HibernateTipoDescarteDAO(	SessionFactory sessionfactory) {
		super(TipoDescarte.class, sessionfactory);
	}

}