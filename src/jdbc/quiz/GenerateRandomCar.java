package jdbc.quiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;

public class GenerateRandomCar {
	
	/*
	 �������� ���� �ڵ������� 100�� �����Ǿ� DB�� ����Ǵ� ���α׷��� ��������

	 ���� ��ȣ�� ����
	 https://post.naver.com/viewer/postView.nhn?volumeNo=24171702&memberNo=35787715 
	 ��ȣ�� ���� ������ �ڿ� ��ȣ�� ���� �����Ǵ� �͵� �����Ͽ�
	 ������ü�� ������ �� DB�� �˸°� �����غ�����
	*/
	
	public static void main(String[] args) {
		Random rn = new Random();
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("�ε� �Ϸ�");
			
			Connection conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521/XEPDB1",
					"hr",
					"1234"
			);
			System.out.println("���� �Ϸ�");
			
			String sql = 
					"INSERT INTO license_plate VALUES (cplate_seq.nextval, ?, ?)";
			
			PreparedStatement pstmt = 
					conn.prepareStatement(sql);
			
			RandomString cr = new RandomString();
			String plate_str = "�����ٶ󸶰ųʴ����ӹ���������뵵�θ𺸼ҿ��������η繫�μ����־ƹٻ�������ȣ";
//			String plate_business_str = "�ƹٻ���";
//			String plate_rent_str = "����ȣ";
			
			
			// Batch : �ϰ�ó��
			for (int i = 1; i <= 100; i++) {
				pstmt.setString(1, "CAR"+i);
				pstmt.setString(2, cr.random_plate(2).toString() 
						+ plate_str.charAt(rn.nextInt(plate_str.length())) 
						+ " " 
						+ cr.random_plate(4).toString());
				
				pstmt.addBatch();
			}
			// ��Ҵٰ� �ѹ��� executeBatch()�ϸ� �� ������ �������� �迭�� ��ȯ�ȴ�
			pstmt.executeBatch();
			System.out.println("���� �Ϸ�");
			
			if(pstmt != null) pstmt.close(); 
			if(conn != null) conn.close(); 
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
}




