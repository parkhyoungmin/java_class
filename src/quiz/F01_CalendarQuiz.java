package quiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class F01_CalendarQuiz {

	/*
	 DB 저장되어 있는 차량정보를 조회해서 차량 5부제를 적용해보세요
	 
	 오늘 출입 제한인 차량의 대수와
	 출입 제한을 위반한 차량의 모든 정보를 출력해보세요
	 */
	
	public static void main(String[] args) {
		SimpleDateFormat simple = new SimpleDateFormat("E요일");
		Date now = new Date();
		
//		Calendar korea_time = Calendar.getInstance();
//		System.out.println(korea_time.getTime());
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("로드 완료");
			
			Connection conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521/XEPDB1",
					"hr",
					"1234"
			);
			System.out.println("연결 성공");
			
			String today = simple.format(now);
			
			System.out.println("오늘 요일 -> " 
					+ today);
			
			PreparedStatement pstmt = 
			conn.prepareStatement(
					"SELECT CAR_ID, CAR_NAME, SUBSTR(car_plate, 8) AS end_num, car_plate FROM license_plate"
					);
			
			ResultSet rs = pstmt.executeQuery();
			
			int count = 0;
			
			System.out.println("출입위반 차량 리스트");
			System.out.println("===============");
			while (rs.next()) {
				if (today.equals("월요일")) {
					if (rs.getString("end_num").equals("1") || rs.getString("end_num").equals("6")) {
						System.out.printf("[ID:%d / 이름:%s / 번호:%s]\n",
								rs.getInt("CAR_ID"),
								rs.getString("CAR_NAME"),
								rs.getString("car_plate"));
						count++;
					}
				} 
				else if (today.equals("화요일")) {
					if (rs.getString("end_num").equals("2") || rs.getString("end_num").equals("7")) {
						System.out.printf("[ID:%d / 이름:%s / 번호:%s]\n",
								rs.getInt("CAR_ID"),
								rs.getString("CAR_NAME"),
								rs.getString("car_plate"));
						count++;
					}
				}
				else if (today.equals("수요일")) {
					if (rs.getString("end_num").equals("3") || rs.getString("end_num").equals("8")) {
						System.out.printf("[ID:%d / 이름:%s / 번호:%s]\n",
								rs.getInt("CAR_ID"),
								rs.getString("CAR_NAME"),
								rs.getString("car_plate"));
						count++;
					}
				}
				else if (today.equals("목요일")) {
					if (rs.getString("end_num").equals("4") || rs.getString("end_num").equals("9")) {
						System.out.printf("[ID:%d / 이름:%s / 번호:%s]\n",
								rs.getInt("CAR_ID"),
								rs.getString("CAR_NAME"),
								rs.getString("car_plate"));
						count++;
					}
				}
				else if (today.equals("금요일")) {
					if (rs.getString("end_num").equals("5") || rs.getString("end_num").equals("0")) {
						System.out.printf("[ID:%d / 이름:%s / 번호:%s]\n",
								rs.getInt("CAR_ID"),
								rs.getString("CAR_NAME"),
								rs.getString("car_plate"));
						count++;
					}
				}
				else {
					System.out.println("주말은 제한없음");
				}
			}
			System.out.printf("위반차량 총%d대\n", count);
			System.out.println("실행 완료");
			
			if(rs != null) rs.close();
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}


















