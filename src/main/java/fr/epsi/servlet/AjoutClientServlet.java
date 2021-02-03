package fr.epsi.servlet;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.epsi.dto.ArticleDTO;
import fr.epsi.dto.ClientDTO;
import fr.epsi.service.ArticleService;
import fr.epsi.service.ClientService;


public class AjoutClientServlet extends HttpServlet{

	@EJB
	private ClientService service;
	
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException
        {
    		this.getServletContext().getRequestDispatcher("/WEB-INF/pages/AjouterClient.jsp").forward(req, resp);
        }
   
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ClientDTO cliDTO = new ClientDTO();
		cliDTO.setNom(req.getParameter("nomArticle"));
		cliDTO.setAdresse(req.getParameter("adresseClient"));
		service.create(cliDTO);
	}

	
}
