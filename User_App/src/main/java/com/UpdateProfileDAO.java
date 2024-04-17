package com;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UpdateProfileDAO {

	public int update(UserBean ub) {
		int k = 0;
		try {
			Connection con = DbCon.getCon();
			PreparedStatement ps = con.prepareStatement("update userreg60 set address=?,mid=?,phno=? where uname=? and pword=?");
	    ps.setString(1, ub.getAddress());
	    ps.setString(2, ub.getMid());
	    ps.setLong(3, ub.getPhno());
	    ps.setString(4, ub.getUname());
	    ps.setString(5, ub.getPword());
	     k = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return k;
	}
}
