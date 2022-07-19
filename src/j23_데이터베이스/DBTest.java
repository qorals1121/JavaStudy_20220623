package j23_데이터베이스;

import java.sql.Connection;
import java.sql.PreparedStatement;

import db.DBConnectionMgr;

public class DBTest {

	public static void main(String[] args) {
		DBConnectionMgr pool = DBConnectionMgr.getInstance();
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = pool.getConnection();
			String sql = "INSERT INTO\r\n"
					+ "	USER_mst\r\n"
					+ "VALUES\r\n"
					+ " 	(\r\n"
					+ " 		0,\r\n"
					+ " 		?,\r\n"
					+ " 		?,\r\n"
					+ " 		?,\r\n"
					+ " 		?\r\n"
					+ "	)";
			
			/*
			 * pstmt 역할
			 * 쿼리의 미비한 부분(? 부분)을 완성시킬 때 사용한다.
			 * 그리고 쿼리를 실행 시킬 때 사용한다.
			 */
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, "김준삼"); // 첫번째 ?에 "김준삼"을 넣어라 (여기서는 0부터 세지않고 1부터 센다)
			pstmt.setString(2, "bbb@gmail.com"); 
			pstmt.setString(3, "bbb"); 
			pstmt.setString(4, "3333");
			int result = pstmt.executeUpdate(); //쿼리 실행
			
			System.out.println(result);
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			pool.freeConnection(con, pstmt)
		}

	}

}
