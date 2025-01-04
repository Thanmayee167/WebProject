package com.thanmayee;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/add")
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = -5544861121298990712L;

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		int sum = i + j;

		Cookie cookie = new Cookie("num", String.valueOf(sum));
		res.addCookie(cookie);

		res.sendRedirect("square");
	}

}