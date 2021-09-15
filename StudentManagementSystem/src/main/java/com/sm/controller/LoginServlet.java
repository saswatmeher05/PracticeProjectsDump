package com.sm.controller;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sm.dto.StudentDTO;
import com.sm.service.StudentService;


@SuppressWarnings("serial")
@WebServlet("/login")
public class LoginServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		try {
			ResultSet rs=new StudentService().login(req);
			if(rs.next()) {
				StudentDTO dto=new StudentDTO();
				dto.setSid(rs.getInt(1));
				dto.setSname(rs.getString(2));
				dto.setSage(rs.getInt(3));
				dto.setSemail(rs.getString(4));
				dto.setSgen(rs.getString(6));
				dto.setSaddr(rs.getString(7));
				HttpSession session=req.getSession();
				session.setAttribute("bean", dto);
				RequestDispatcher rd=req.getRequestDispatcher("/welcome");
				rd.forward(req, res);
			}
		}catch(Exception e) {e.printStackTrace();}
	}
}
