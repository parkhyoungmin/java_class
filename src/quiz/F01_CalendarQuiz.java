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
	 DB ����Ǿ� �ִ� ���������� ��ȸ�ؼ� ���� 5������ �����غ�����
	 
	 ���� ���� ������ ������ �����
	 ���� ������ ������ ������ ��� ������ ����غ�����
	 */
	
	public static void main(String[] args) {
		SimpleDateFormat simple = new SimpleDateFormat("E����");
		Date now = new Date();
		
//		Calendar korea_time = Calendar.getInstance();
//		System.out.println(korea_time.getTime());
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("�ε� �Ϸ�");
			
			Connection conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521/XEPDB1",
					"hr",
					"1234"
			);
			System.out.println("���� ����");
			
			String today = simple.format(now);
			
			System.out.println("���� ���� -> " 
					+ today);
			
			PreparedStatement pstmt = 
			conn.prepareStatement(
					"SELECT CAR_ID, CAR_NAME, SUBSTR(car_plate, 8) AS end_num, car_plate FROM license_plate"
					);
			
			ResultSet rs = pstmt.executeQuery();
			
			int count = 0;
			
			System.out.println("�������� ���� ����Ʈ");
			System.out.println("===============");
			while (rs.next()) {
				if (today.equals("������")) {
					if (rs.getString("end_num").equals("1") || rs.getString("end_num").equals("6")) {
						System.out.printf("[ID:%d / �̸�:%s / ��ȣ:%s]\n",
								rs.getInt("CAR_ID"),
								rs.getString("CAR_NAME"),
								rs.getString("car_plate"));
						count++;
					}
				} 
				else if (today.equals("ȭ����")) {
					if (rs.getString("end_num").equals("2") || rs.getString("end_num").equals("7")) {
						System.out.printf("[ID:%d / �̸�:%s / ��ȣ:%s]\n",
								rs.getInt("CAR_ID"),
								rs.getString("CAR_NAME"),
								rs.getString("car_plate"));
						count++;
					}
				}
				else if (today.equals("������")) {
					if (rs.getString("end_num").equals("3") || rs.getString("end_num").equals("8")) {
						System.out.printf("[ID:%d / �̸�:%s / ��ȣ:%s]\n",
								rs.getInt("CAR_ID"),
								rs.getString("CAR_NAME"),
								rs.getString("car_plate"));
						count++;
					}
				}
				else if (today.equals("�����")) {
					if (rs.getString("end_num").equals("4") || rs.getString("end_num").equals("9")) {
						System.out.printf("[ID:%d / �̸�:%s / ��ȣ:%s]\n",
								rs.getInt("CAR_ID"),
								rs.getString("CAR_NAME"),
								rs.getString("car_plate"));
						count++;
					}
				}
				else if (today.equals("�ݿ���")) {
					if (rs.getString("end_num").equals("5") || rs.getString("end_num").equals("0")) {
						System.out.printf("[ID:%d / �̸�:%s / ��ȣ:%s]\n",
								rs.getInt("CAR_ID"),
								rs.getString("CAR_NAME"),
								rs.getString("car_plate"));
						count++;
					}
				}
				else {
					System.out.println("�ָ��� ���Ѿ���");
				}
			}
			System.out.printf("�������� ��%d��\n", count);
			System.out.println("���� �Ϸ�");
			
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


















