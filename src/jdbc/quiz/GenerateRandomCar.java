package jdbc.quiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;

public class GenerateRandomCar {
	
	/*
	 랜덤값을 가진 자동차들이 100대 생성되어 DB에 저장되는 프로그램을 만들어보세요

	 차량 번호판 정보
	 https://post.naver.com/viewer/postView.nhn?volumeNo=24171702&memberNo=35787715 
	 번호를 랜덤 생성한 뒤에 번호에 따라 결정되는 것들 적용하여
	 차량객체를 생성한 후 DB에 알맞게 저장해보세요
	*/
	
	public static void main(String[] args) {
		Random rn = new Random();
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("로드 완료");
			
			Connection conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521/XEPDB1",
					"hr",
					"1234"
			);
			System.out.println("연결 완료");
			
			String sql = 
					"INSERT INTO license_plate VALUES (cplate_seq.nextval, ?, ?)";
			
			PreparedStatement pstmt = 
					conn.prepareStatement(sql);
			
			RandomString cr = new RandomString();
			String plate_str = "가나다라마거너더러머버서어저고노도로모보소오조구누두루무부수우주아바사자하허호";
//			String plate_business_str = "아바사자";
//			String plate_rent_str = "하허호";
			
			
			// Batch : 일괄처리
			for (int i = 1; i <= 100; i++) {
				pstmt.setString(1, "CAR"+i);
				pstmt.setString(2, cr.random_plate(2).toString() 
						+ plate_str.charAt(rn.nextInt(plate_str.length())) 
						+ " " 
						+ cr.random_plate(4).toString());
				
				pstmt.addBatch();
			}
			// 모았다가 한번에 executeBatch()하면 각 쿼리의 실행결과가 배열로 반환된다
			pstmt.executeBatch();
			System.out.println("실행 완료");
			
			if(pstmt != null) pstmt.close(); 
			if(conn != null) conn.close(); 
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
}




