package tickets.packages;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

import db.packages.dbConnect;

public class ticketDao {
	
	dbConnect db = new dbConnect();
	public ArrayList<Ticket> getTickets() throws SQLException {

		ResultSet rs = db.getQueryResult("SELECT * FROM unpark_tickets");
		ResultSetMetaData rsmd = rs.getMetaData(); 
		int columnCount = rsmd.getColumnCount();
		ArrayList<Ticket> ticketsList = new ArrayList<>(columnCount);
		while(rs.next()) {
			ticketsList.add(new Ticket(rs.getInt("id"),rs.getString("ticket_number"),rs.getBoolean("inpark_or_not")));
		}
		return ticketsList;
	}
}
