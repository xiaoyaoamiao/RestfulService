package db.packages;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class dbConnect {
	
	Connection con = null;
	Statement stmt = null;
	ResultSet rs = null;
	public dbConnect() {
		initConnect();
	}
	
	public void initConnect(){
		try{  
				Class.forName("com.mysql.cj.jdbc.Driver");
				con = DriverManager.getConnection(  
				"jdbc:mysql://localhost:3306/park_ticket","root","rootroot");  
				stmt = con.createStatement();
			}
		catch (Exception e){ 
				System.out.println(e);
			}  
		}  
	
	public ResultSet getQueryResult(String sql) throws SQLException{
		
		return stmt.executeQuery(sql);
	}
}
