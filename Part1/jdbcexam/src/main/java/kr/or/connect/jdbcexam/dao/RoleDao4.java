package kr.or.connect.jdbcexam.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class RoleDao4 {
	private static String dburl = "jdbc:mysql://localhost:3306/connectdb";
	private static String dbUser = "choihm9903";
	private static String dbpasswd = "0317";

	public int deleteRole(Integer roleId) {
		int deleteCount = 0;
		
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			Class.forName( "com.mysql.jdbc.Driver" );
			
			conn = DriverManager.getConnection ( dburl, dbUser, dbpasswd );
			
			String sql = "DELETE FROM role WHERE role_id = ?";

			ps = conn.prepareStatement(sql);
			
			ps.setInt(1,  roleId);

			deleteCount = ps.executeUpdate();

		}catch(Exception ex) {
			ex.printStackTrace();
		}finally {
			if(ps != null) {
				try {
					ps.close();
				}catch(Exception ex) {}
			} // if
			
			if(conn != null) {
				try {
					conn.close();
				}catch(Exception ex) {}
			} // if
		} // finally

		return deleteCount;
	}
}
