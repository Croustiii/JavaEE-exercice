package fr.epsi.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.UserTransaction;

import fr.epsi.entite.Client;

public class ClientDAOImpl implements ClientDAO{

	
	EntityManager eM;
	
	UserTransaction userTransaction;
	
	public ClientDAOImpl(EntityManager em, UserTransaction ut) {
		
		this.eM = em;
		this.userTransaction = ut;
	}

	public void Create(Client client) {
		
		try {
			userTransaction.begin();
			eM.persist(client);
			userTransaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public List<Client> getClients() {
		
		return eM.createQuery("Select c from Client c", Client.class).getResultList();
		
	}
	
}
