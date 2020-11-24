package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class ResultSetMetDataTest {
	
	public static void main(String[] args) {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("���������� �ε�Ǿ����ϴ�");
		
			Connection con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521/XEPDB1",
					"hr",
					"1234"
			);
			System.out.println("���Ἲ��");
			
			PreparedStatement pstmt = 
					con.prepareStatement("SELECT * FROM employees");
			
			ResultSet rs = pstmt.executeQuery();
			
			// ���������� ������ ResultSet�� ���� ���� ��� ��ü
			ResultSetMetaData rsmd = rs.getMetaData();
			
			System.out.println("�÷� ���� : " + rsmd.getColumnCount());
			
			for(int i = 1; i <= rsmd.getColumnCount(); i++) {
				System.out.println(i + "��° �÷� ����");
				System.out.println("\t�÷� �̸� : " + rsmd.getColumnName(i));
				System.out.println("\t�÷� Ÿ�� �̸� : " + rsmd.getColumnTypeName(i));
				System.out.print("\t�÷� Ÿ�� : " + rsmd.getColumnType(i));
				
				switch(rsmd.getColumnType(i)) {
				case java.sql.Types.VARCHAR:
					System.out.println(" varcher");
					break;
				case java.sql.Types.NUMERIC:
					System.out.println(" number");
					break;
				case java.sql.Types.DATE:
					System.out.println(" date");
					break;
				case java.sql.Types.TIMESTAMP:
					System.out.println(" timestamp");
					break;
				default:
					System.out.println(" i don't know");
					break;
				}
				
				System.out.println("\t�÷� ũ�� : " + rsmd.getColumnDisplaySize(i));
			}
			
			if(pstmt != null) pstmt.close();
			if(con != null) con.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("[ojdbc] Ŭ���� ��ΰ� Ʋ�Ƚ��ϴ�.");
		}
		
	}
	
}
