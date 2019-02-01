package db.packages;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import tickets.packages.Ticket;

public class testDB {

	
	Connection con = null;
	Statement stmt = null;
	ResultSet rs = null;
	public static void main(String[] args) throws SQLException {
		testDB test = new testDB();
		// TODO Auto-generated method stub
		test.initConnect();
		test.rs = test.getQueryResult("SELECT * FROM park_ticket.unpark_tickets");
		ResultSetMetaData rsmd = test.rs.getMetaData(); 
		int columnCount = rsmd.getColumnCount();
		System.out.print(columnCount);
		while(test.rs.next()) {
			System.out.print(test.rs.getInt("id"));
		}
		test.rs.close();
		test.stmt.close();
		test.con.close();
	}
	public void initConnect(){
		try{  
				Class.forName("com.mysql.cj.jdbc.Driver");
				con = DriverManager.getConnection(  
				"jdbc:mysql://localhost:3306/park_ticket?useUnicode=true&characterEncoding=utf-8&useSSL=false","root","rootroot");  
				stmt = con.createStatement();
			}
		catch (Exception e){ 
				System.out.println(e);
			}  
		}  
	
	public ResultSet getQueryResult(String sql) throws SQLException{
		initConnect();
		rs = stmt.executeQuery(sql);

		return rs;
	}

}
