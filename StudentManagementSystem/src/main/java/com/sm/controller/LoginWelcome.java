package com.sm.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sm.dto.StudentDTO;

@SuppressWarnings("serial")
@WebServlet("/welcome")
public class LoginWelcome extends HttpServlet{
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter out=res.getWriter();
		res.setContentType("text/html");
		HttpSession session=req.getSession();
		StudentDTO dto=(StudentDTO)session.getAttribute("bean");
		out.println("<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css\">");
		out.println(
				"<div class='container'> <h1 class='text-center text-secondary'>Student Information</h1>");
		
		out.println("<table class='table table-bordered table-hover'>");
//		id
		out.println("<tr>");
		out.println("<th>ID</th>");
		out.println("<td>"+dto.getSid()+"</td>");
		out.println("<tr>");
//		name
		out.println("<tr>");
		out.println("<th>Name</th>");
		out.println("<td>"+dto.getSname()+"</td>");
		out.println("<tr>");
//		age
		out.println("<tr>");
		out.println("<th>Age</th>");
		out.println("<td>"+dto.getSage()+"</td>");
		out.println("<tr>");
//		email
		out.println("<tr>");
		out.println("<th>Email</th>");
		out.println("<td>"+dto.getSemail()+"</td>");
		out.println("<tr>");
//		gender
		out.println("<tr>");
		out.println("<th>Gender</th>");
		out.println("<td>"+dto.getSgen()+"</td>");
		out.println("<tr>");
//		address
		out.println("<tr>");
		out.println("<th>Address</th>");
		out.println("<td>"+dto.getSaddr()+"</td>");
		out.println("<tr>");
		out.println("</table>");
		out.println("</div>");
	}
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doPost(req, resp);
	}
}
