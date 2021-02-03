package fr.epsi.service;

import java.util.List;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.UserTransaction;

import fr.epsi.dao.ClientDAO;
import fr.epsi.dao.ClientDAOImpl;
import fr.epsi.dto.ClientDTO;
import fr.epsi.entite.Client;

@Stateless
public class ClientServiceImpl implements ClientService{

	@PersistenceContext
	EntityManager entityManager;
	
	@Resource
	UserTransaction userTransaction;
	
	public void create(ClientDTO client) {
		Client cli = new Client();
		cli.setNom(client.getNom());
		cli.setAdresse(client.getAdresse());
		ClientDAO cliDAO = new ClientDAOImpl(entityManager,userTransaction);
		cliDAO.Create(cli);
		
		
		
	}

	public List<Client> getClients() {
		ClientDAO dao = new ClientDAOImpl(entityManager, userTransaction);
		return dao.getClients();
	}

	
}
