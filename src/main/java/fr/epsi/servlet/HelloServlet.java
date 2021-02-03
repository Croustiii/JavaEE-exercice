package fr.epsi.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class HelloServlet extends HttpServlet{
	//Servlet de page d'accueil de l'application web
	
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException
        {
    		this.getServletContext().getRequestDispatcher("/WEB-INF/pages/welcome.jsp").forward(req, resp);
        }

	
}
