package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class HikariCpTest {

	public static void main(String[] args) {
		
//		1.
		HikariConfig config = new HikariConfig();
		config.setJdbcUrl("jdbc:oracle:thin:@localhost:1521/XEPDB1");
		config.setUsername("hr");
		config.setPassword("1234");
		config.addDataSourceProperty("cachePrepStmts", "true");
		config.addDataSourceProperty("prepStmtCacheSize", "250");
		config.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");
		
		HikariDataSource ds = new HikariDataSource(config);
		
		try {
			Connection conn = ds.getConnection();
			
			PreparedStatement pstmt = 
					conn.prepareStatement("SELECT * FROM employees ");

			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				System.out.printf("%s\t%s\t%d\t%d\n",
						rs.getString("last_name"),
						rs.getString("first_name"),
						rs.getInt("salary"),
						rs.getInt("department_id")
				);
			}
			
			rs.close();
			pstmt.close();
			conn.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
//		2.
		HikariDataSource hd = new HikariDataSource ();
		hd . setJdbcUrl ( " jdbc : mysql : // localhost : 1521 / XEPDB1 " );
		hd . setUsername ( " hr " );
		hd . setPassword ( " 1234 " );
		
		
//		3.
		HikariConfig config1 =  new  HikariConfig ( " /some/path/hikari.properties " );
		HikariDataSource hdd = new HikariDataSource (config1);
		
//		dataSourceClassName = org.postgresql.ds.PGSimpleDataSource
//		dataSource.user = test
//		dataSource.password = test
//		dataSource.databaseName = mydb
//		dataSource.portNumber = 5432
//		dataSource.serverName = localhost
		
		
		
	}

}








