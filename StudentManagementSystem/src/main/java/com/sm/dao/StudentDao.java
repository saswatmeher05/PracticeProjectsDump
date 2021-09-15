package com.sm.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.HttpServletRequest;

public class StudentDao {
	public ResultSet login(HttpServletRequest req) {
		ResultSet rs=null;
		try {
			Connection con=DBConnection.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from student where semail=? and spwd=?");
			ps.setString(1, req.getParameter("semail"));
			ps.setString(2, req.getParameter("spwd"));
			rs=ps.executeQuery();
		}catch(Exception e) {e.printStackTrace();}
		return rs;
	}

}
