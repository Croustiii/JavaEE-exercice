package fr.epsi.service;

import java.util.List;

import fr.epsi.entite.Facture;

public interface FactureService {
	
	Facture get(Long id);
	
	List<Facture> get();
}
