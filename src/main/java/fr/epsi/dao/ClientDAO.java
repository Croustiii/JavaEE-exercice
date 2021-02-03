package fr.epsi.dao;

import java.util.List;

import fr.epsi.entite.Client;

public interface ClientDAO {

	void Create(Client client);
	
	List<Client> getClients();
	
	
}
