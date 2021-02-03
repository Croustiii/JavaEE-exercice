package fr.epsi.dao;

import java.util.List;

import fr.epsi.entite.Facture;

public interface FactureDAO {

	
	
	void create(Facture f);
	
	
	List<Facture> get();
	
	Facture get(Long id);
}
