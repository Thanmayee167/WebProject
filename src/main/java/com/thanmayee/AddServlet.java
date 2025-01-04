package com.thanmayee;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = -5544861121298990712L;

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		int i= Integer.parseInt(req.getParameter("num1"));
		int j= Integer.parseInt(req.getParameter("num2"));
		req.setAttribute("result", (i+j));
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("/square");
		requestDispatcher.forward(req, res);
	}

}
