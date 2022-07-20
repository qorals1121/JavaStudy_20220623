package j24_User.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import db.DBConnectionMgr;
import j22_예외.ExceptionTest;

public class UserRepsitory {
	private DBConnectionMgr pool;
	
	public UserRepsitory() {
		pool = DBConnectionMgr.getInstance();
	}
	
	public User findUserByUsername(String username) {
		String sql = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		User user = null;
		
		try {
			con = pool.getConnection();
			sql = "select * from user_mst where username = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, username);
			rs = pstmt.executeQuery(); // ResultSet이 return된다
			if(rs.next()) {
				user = User.builder()
						.usercode(rs.getInt(1))
						.name(rs.getString(2))
						.email(rs.getString(3))
						.username(rs.getString(4))
						.password(rs.getString(5))
						.build();
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			pool.freeConnection(con, pstmt, rs);
		}
		
		return user;
	}
		
		
		public int save(User user) {
			Connection con = null;
			PreparedStatement pstmt = null;
			int result = 0;
			
			try {
			con = pool.getConnection();
			String sql = "insert into user_mst values(0, ?, ?, ?, ?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, user.getName());
			pstmt.setString(1, user.getEmail());
			pstmt.setString(1, user.getUsername());
			pstmt.setString(1, user.getPassword());
			result = pstmt.executeUpdate();
		
			}catch (Exception e) {
				e.printStackTrace();
			}finally {
				pool.freeConnection(con, pstmt);
			}
			return result;
	}
}
