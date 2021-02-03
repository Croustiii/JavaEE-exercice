package fr.epsi.servlet;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.epsi.service.ArticleService;

public class ArticlesServlet extends HttpServlet{
	
	
	@EJB
	private ArticleService service;
	
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException
        {
    		req.setAttribute("listeArticles", service.get());
    		this.getServletContext().getRequestDispatcher("/WEB-INF/pages/articles.jsp").forward(req, resp);
        }
}
