package fr.epsi.servlet;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.epsi.service.ClientService;

public class ClientsServlet extends HttpServlet{
	
	@EJB
	private ClientService service;
	
	
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException
        {
    		req.setAttribute("listeClients", service.getClients());
    		this.getServletContext().getRequestDispatcher("/WEB-INF/pages/clients.jsp").forward(req, resp);
        }



}
