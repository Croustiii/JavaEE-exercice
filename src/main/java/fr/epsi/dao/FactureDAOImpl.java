package fr.epsi.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.UserTransaction;

import fr.epsi.entite.Facture;

public class FactureDAOImpl implements FactureDAO {

	EntityManager entityManager;
	
	UserTransaction userTransaction;
	
	
	
	public FactureDAOImpl(EntityManager em, UserTransaction userTr) {
		this.entityManager = em;
		this.userTransaction = userTr;
	}

	public void create(Facture f) {
		try {
			userTransaction.begin();
			entityManager.persist(f);
			userTransaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public List<Facture> get() {
		return entityManager.createQuery("Select f from Facture f", Facture.class).getResultList();
	}

	public Facture get(Long id) {
		
		return entityManager.createQuery("select f from Facture f where f.id = :id", Facture.class)
				.setParameter("id", id)
				.getSingleResult();
	}

}
