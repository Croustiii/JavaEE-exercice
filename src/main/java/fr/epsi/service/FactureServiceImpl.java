package fr.epsi.service;

import java.util.List;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.UserTransaction;

import fr.epsi.dao.FactureDAO;
import fr.epsi.dao.FactureDAOImpl;
import fr.epsi.entite.Facture;

public class FactureServiceImpl implements FactureService {

	
	@PersistenceContext
	EntityManager entityManager;
	
	@Resource
	UserTransaction userTransaction;
	
	
	public Facture get(Long id) {
		FactureDAO factDAO = new FactureDAOImpl(entityManager, userTransaction);
		return factDAO.get(id);
	}

	public List<Facture> get() {
		FactureDAO factDAO = new FactureDAOImpl(entityManager, userTransaction);
		return factDAO.get();
	}

}
