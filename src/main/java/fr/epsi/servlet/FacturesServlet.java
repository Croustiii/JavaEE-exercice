package fr.epsi.servlet;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.epsi.service.FactureService;

public class FacturesServlet extends HttpServlet{
	
	
	@EJB
	private FactureService service;
	
	
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException
        {
			req.setAttribute("listeFactures", service.get());
			this.getServletContext().getRequestDispatcher("/WEB-INF/pages/factures.jsp").forward(req, resp);
        }
	
	
	
}
