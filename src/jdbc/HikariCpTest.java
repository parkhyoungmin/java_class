package jdbc;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class HikariCpTest {

	public static void main(String[] args) {
		
//		1. Hikariconfig ��ü�� ������ ���� �� DataSource �����ڿ� ����
//		HikariConfig config = new HikariConfig();
//		config.setJdbcUrl("jdbc:oracle:thin:@localhost:1521/XEPDB1");
//		config.setUsername("hr");
//		config.setPassword("1234");
//		config.addDataSourceProperty("cachePrepStmts", "true");
//		config.addDataSourceProperty("prepStmtCacheSize", "250");
//		config.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");
//		
//		HikariDataSource ds = new HikariDataSource(config);
//		
//		try {
//			Connection conn = ds.getConnection();
//			
//			PreparedStatement pstmt = 
//					conn.prepareStatement("SELECT * FROM employees ");
//
//			ResultSet rs = pstmt.executeQuery();
//			
//			while (rs.next()) {
//				System.out.printf("%s\t%s\t%d\t%d\n",
//						rs.getString("last_name"),
//						rs.getString("first_name"),
//						rs.getInt("salary"),
//						rs.getInt("department_id")
//				);
//			}
//			
//			rs.close();
//			pstmt.close();
//			conn.close();
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
		
		
//		2. Config ����� �������� �̷��� �ϼ���
//		HikariDataSource ds = new HikariDataSource();
//		ds.setJdbcUrl("jdbc:oracle:thin:@localhost:1521/XEPDB1");
//		ds.setUsername("hr");
//		ds.setPassword("1234");
//		try {
//			Connection conn = ds.getConnection();
//			
//			PreparedStatement pstmt = 
//					conn.prepareStatement("SELECT * FROM employees ");
//
//			ResultSet rs = pstmt.executeQuery();
//			
//			while (rs.next()) {
//				System.out.printf("%s\t%s\t%d\t%d\n",
//						rs.getString("last_name"),
//						rs.getString("first_name"),
//						rs.getInt("salary"),
//						rs.getInt("department_id")
//				);
//			}
//			
//			rs.close();
//			pstmt.close();
//			conn.close();
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
		
//		3. ���� ���Ͽ� ����� ���� �̿��ϴ� ���
//		Map, ��ųʸ�, Property, Entry, JSON.. �����͸� Key=Value���·� �ٷ�� �͵�
//		�� ������Ʈ ������ ��θ� ã�ư���
//		HikariConfig config = new HikariConfig("some/path/hikari.properties");
//		HikariDataSource ds = new HikariDataSource(config);
//		try {
//			
//			Connection conn = ds.getConnection();
//			
//			PreparedStatement pstmt = 
//					conn.prepareStatement("SELECT * FROM employees ");
//
//			ResultSet rs = pstmt.executeQuery();
//			
//			while (rs.next()) {
//				System.out.printf("%s\t%s\t%d\t%d\n",
//						rs.getString("last_name"),
//						rs.getString("first_name"),
//						rs.getInt("salary"),
//						rs.getInt("department_id")
//				);
//			}
//			
//			rs.close();
//			pstmt.close();
//			conn.close();
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
		
		
//		4. ���� ���� ��ü�� �����ؼ� �����ϴ� ���
//		Properties props = new Properties();
//		props.setProperty("dataSourceClassName", "oracle.jdbc.pool.OracleDataSource");
//		props.setProperty("dataSource.url", "jdbc:oracle:thin:@localhost:1521/XEPDB1");
//		props.setProperty("dataSource.user", "hr");
//		props.setProperty("dataSource.password", "1234");
//		props.put("dataSource.logWriter", new PrintWriter(System.out));
//
//		HikariConfig config = new HikariConfig(props);
//		HikariDataSource ds = new HikariDataSource(config);
//		try {
//			
//			Connection conn = ds.getConnection();
//			
//			PreparedStatement pstmt = 
//					conn.prepareStatement("SELECT * FROM employees ");
//
//			ResultSet rs = pstmt.executeQuery();
//			
//			while (rs.next()) {
//				System.out.printf("%s\t%s\t%d\t%d\n",
//						rs.getString("last_name"),
//						rs.getString("first_name"),
//						rs.getInt("salary"),
//						rs.getInt("department_id")
//				);
//			}
//			
//			rs.close();
//			pstmt.close();
//			conn.close();
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
		
		

	}

}








