package com.thanmayee;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class NameServlet extends HttpServlet {
	private static final long serialVersionUID = -5544861121298990712L;

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

		ServletContext servletContext = getServletContext();
		String initParameter = servletContext.getInitParameter("name");

		PrintWriter writer = res.getWriter();
		writer.println("My name is " + initParameter);

	}

}
