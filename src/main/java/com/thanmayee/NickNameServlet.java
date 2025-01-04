package com.thanmayee;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class NickNameServlet extends HttpServlet {
	private static final long serialVersionUID = -5544861121298990712L;

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		ServletContext servletContext = getServletContext();
		String initParameter = servletContext.getInitParameter("name");

		PrintWriter writer = res.getWriter();
		writer.println("My name is " + initParameter);

		ServletConfig servletConfig = getServletConfig();
		initParameter = servletConfig.getInitParameter("name");
		writer.println("My nick name is " + initParameter);
	}

}
