package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ConnectPractice {
	
	// 사용자로부터 부서번호를 입력받으면
	// 해당 부서의 모든 사원들의 정보를 조회해서 콘솔에 출력해보세요
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("로드완료");
			
			Connection con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521/XEPDB1",
					"hr",
					"1234"
			);
			System.out.println("연결성공");
			
			System.out.print("부서번호 입력: ");
			PreparedStatement ps 
				= con.prepareStatement("SELECT * FROM employees " 
							+ "WHERE department_id IN (?)");
			ps.setInt(1, sc.nextInt());
			
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				System.out.printf("%s\t%s\t%d\t%d\n",
						rs.getString("last_name"),
						rs.getString("first_name"),
						rs.getInt("salary"),
						rs.getInt("department_id")
				);
			}
			
			if(rs != null) rs.close();
			if(ps != null) ps.close();
			if(con != null) con.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
	
	
	
	
}





