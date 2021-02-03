package fr.epsi.entite;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Facture {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Date date;
	private String numero;
	private double prix;
	
	@ManyToOne
	@JoinColumn(name = "client_id")
	private Client client;
	
	@OneToMany(mappedBy = "facture")
	private List<LigneFacture> lignesFact = new ArrayList<LigneFacture>();
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<LigneFacture> getLignesFact() {
		return lignesFact;
	}

	public void setLignesFact(List<LigneFacture> lignesFact) {
		this.lignesFact = lignesFact;
	}
	
	
	
}
