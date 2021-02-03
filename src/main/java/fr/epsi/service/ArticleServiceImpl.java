package fr.epsi.service;

import java.util.List;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.UserTransaction;

import fr.epsi.dao.ArticleDAO;
import fr.epsi.dao.ArticleDAOImpl;
import fr.epsi.dto.ArticleDTO;
import fr.epsi.entite.Article;


@Stateless
public class ArticleServiceImpl implements ArticleService {

	@PersistenceContext
	EntityManager em;
	
	@Resource
	UserTransaction userTransaction;
	
	
	public void create(ArticleDTO art) {
		Article article = new Article();
		article.setNom(art.getNom());
		article.setPrix(art.getPrix());
		ArticleDAO artDAO = new ArticleDAOImpl(em, userTransaction);
		artDAO.create(article);

	}

	public List<Article> get() {
		ArticleDAO artDAO = new ArticleDAOImpl(em, userTransaction);
		return artDAO.get();
	}

}
