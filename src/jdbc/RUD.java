package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RUD {
	
	/*
	 # CRUD
	 	- ��� ���α׷��� CRUD�� �ִ�
	 	
	 	C : Create (INSERT)
	 	R : Read (SELECT)
	 	U : Update (UPDATE)
	 	D : Delete (DELETE)
	 	
	 	JDBC���� SELETE�� �ϸ� ResultSet�� ��ȯ�ȴ�
	 	�� ���� INSERT, UPDATE, DELETE�� ����� ���� ��ȯ�ȴ�
	 */
	
	public static void main(String[] args) {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521/XEPDB1",
					"hr",
					"1234"
			);
			System.out.println("���Ἲ��");
			
			String sql = "INSERT INTO coffees VALUES (empp_seq.nextval, ?, ?)";
			
			PreparedStatement pstmt = 
					con.prepareStatement(sql);
			
			pstmt.setString(1, "ī���");
			pstmt.setInt(2, 3200);
			
			int row = pstmt.executeUpdate();
			
			// pstmt.executeQuery()
			//	- ResultSet�� ��ȯ�� ���� ����(SELECT)�� �����ų �� ����Ѵ�
			
			// pstmt.executeUpdate()
			// - DML�� INSERT, UPDATE, DELETE �Ǵ� ��ȯ�Ǵ� ���� ����
			//	DDL ���� �������� �����ų �� ����Ѵ�
			System.out.printf("%d���� ����Ǿ����ϴ�.\n", row);
			
			if(pstmt != null) pstmt.close(); 
			if(con != null) con.close(); 
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
}

















