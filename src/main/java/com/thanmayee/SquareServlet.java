package com.thanmayee;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SquareServlet extends HttpServlet {
	private static final long serialVersionUID = -5544861121298990712L;

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		Object attribute = req.getAttribute("result");
		int num = (int) attribute;
		PrintWriter writer = res.getWriter();
		writer.println("Result is: "+(Math.pow(num, 2)));
	}

}
