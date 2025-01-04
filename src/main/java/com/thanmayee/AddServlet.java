package com.thanmayee;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = -5544861121298990712L;

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int i= Integer.parseInt(req.getParameter("num1"));
		int j= Integer.parseInt(req.getParameter("num2"));
		PrintWriter writer = res.getWriter();
		writer.println("Result is: "+(i+j));
	}

}
