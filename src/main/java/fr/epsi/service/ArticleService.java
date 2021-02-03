package fr.epsi.service;

import java.util.List;

import fr.epsi.dto.ArticleDTO;
import fr.epsi.entite.Article;

public interface ArticleService {
	
	void create(ArticleDTO article);
	
	//liste de tous les articles de la BDD
	List<Article> get();

}
