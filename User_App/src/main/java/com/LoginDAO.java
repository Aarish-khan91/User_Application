package com;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDAO {

	public UserBean get(String uname, String pword) throws SQLException {
		Connection con = DbCon.getCon();
		System.out.println(uname);
		System.out.println(pword);

		PreparedStatement ps = con.prepareStatement("select * from user50 where uname='Ravi55' and pword='2020'");
		ps.setString(1, uname);
		ps.setString(2, pword);
		
//		UserBean us = null;
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			System.out.println(rs.getString("MID"));
			System.out.println(rs.getString("uname"));
			System.out.println(rs.getString("pword"));
			System.out.println(rs.getString("fname"));
			System.out.println(rs.getString("lname"));
			System.out.println(rs.getString("address"));
			System.out.println(rs.getString("phno"));

			
//			us = new UserBean(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
//					rs.getString(6), rs.getLong(7));
		}
		return null;
	}
}
