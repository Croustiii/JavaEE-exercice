package fr.epsi.servlet;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.epsi.dto.ArticleDTO;
import fr.epsi.service.ArticleService;


public class AjoutArticleServlet extends HttpServlet{

	@EJB
	private ArticleService service;
	
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException
        {
    		this.getServletContext().getRequestDispatcher("/WEB-INF/pages/AjouterArticle.jsp").forward(req, resp);
        }
   
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ArticleDTO artDTO = new ArticleDTO();
		artDTO.setNom(req.getParameter("nomArticle"));
		artDTO.setPrix(Double.parseDouble(req.getParameter("prixArticle")));
		service.create(artDTO);
	}

	
}
