package fr.epsi.dto;

public class ArticleDTO {
	
	private String nom;
	private Double Prix;
	
	
	public Double getPrix() {
		return Prix;
	}
	public void setPrix(Double prix) {
		Prix = prix;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
	
}
