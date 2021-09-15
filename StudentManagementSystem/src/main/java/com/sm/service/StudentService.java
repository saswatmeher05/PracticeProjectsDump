package com.sm.service;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import com.sm.dao.StudentDao;

public class StudentService {
	public ResultSet login(HttpServletRequest req) throws SQLException{
		ResultSet rs=new StudentDao().login(req);
		return rs;
	}

}
