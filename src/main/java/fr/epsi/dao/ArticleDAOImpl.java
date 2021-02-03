package fr.epsi.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.transaction.UserTransaction;

import fr.epsi.entite.Article;

@Stateless
public class ArticleDAOImpl implements ArticleDAO {

	EntityManager em;
	
	UserTransaction userTransaction;
	
	public ArticleDAOImpl (EntityManager em, UserTransaction userTr) {
		this.em = em;
		this.userTransaction = userTr;
	}
	
	public void create(Article a) {
		
		try {
			userTransaction.begin();
			em.persist(a);
			userTransaction.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public List<Article> get() {
		return em.createQuery("Select a from Article a", Article.class).getResultList();
	}

}
