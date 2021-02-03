package fr.epsi.servlet;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.epsi.service.FactureService;

public class FactureDetailServlet extends HttpServlet {

	
	@EJB
	private FactureService service;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Long id = Long.parseLong(req.getParameter("id"));
		req.setAttribute("facture", service.get(id));
		this.getServletContext().getRequestDispatcher("/WEB-INF/pages/detailFacture.jsp").forward(req, resp);
	}
}
