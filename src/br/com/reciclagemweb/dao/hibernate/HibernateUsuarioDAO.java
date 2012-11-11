package br.com.reciclagemweb.dao.hibernate;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.reciclagemweb.business.entity.Usuario;
import br.com.reciclagemweb.dao.UsuarioDAO;

@Repository(value="usuarioDao")
public class HibernateUsuarioDAO extends HibernateGenericDAO<Usuario> implements UsuarioDAO {

	@Autowired
	public HibernateUsuarioDAO(SessionFactory sessionfactory) {
		super(Usuario.class, sessionfactory);
	}

	@Override
	@Transactional
	public Usuario getPorLogin(String login) {
		Criteria criteria = getSession().createCriteria(classe);
		criteria.add(Restrictions.eq("login", login));
		
		return (Usuario) criteria.uniqueResult();
	}

}
