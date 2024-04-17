package com;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.catalina.User;

public class InsertDAO {

	public int insert(UserBean us) throws SQLException {
		Connection con = DbCon.getCon();
		PreparedStatement ps = con.prepareStatement("insert into userreg60 values(?,?,?,?,?,?,?)");
		ps.setString(1, us.getUname());
		ps.setString(2, us.getPword());
		ps.setString(3, us.getFname());
		ps.setString(4, us.getLname());
		ps.setString(5, us.getAddress());
		ps.setString(6, us.getMid());
		ps.setLong(7, us.getPhno());

		int k = ps.executeUpdate();
		return k;
	}
}
