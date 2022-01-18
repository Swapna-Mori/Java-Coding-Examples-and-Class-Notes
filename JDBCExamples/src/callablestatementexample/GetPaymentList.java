package callablestatementexample;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;

public class GetPaymentList {
	static Connection conn = null;
	static String sql = "{call getpaymentgreaterthan55000()}";
	public static void main(String[] args) {
		conn = DBConnection.getDBConnection();
		if(conn != null) {
			try {
				CallableStatement cstmt = conn.prepareCall(sql);
				ResultSet rs = cstmt.executeQuery();
				while(rs.next()) {
					System.out.println(rs.getInt(1) + "\t"+ rs.getString(2)+ "\t"+rs.getInt(3));
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
	}

	}

}
