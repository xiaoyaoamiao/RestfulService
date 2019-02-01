package tickets.packages;
import java.sql.SQLException;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;

@Path("/ticketServices")
public class ticketService {
	ticketDao ticket = new ticketDao();
	
	@GET
	@Path("/add")
	@Produces(MediaType.TEXT_PLAIN)
	public double Add(@QueryParam("x") double x,@QueryParam("y") double y) {
		return x+y;  
	}  
	
	@GET
	@Path("/tickets")
	@Produces(MediaType.APPLICATION_JSON)
	public String getTickets() throws SQLException {
		return new Gson().toJson(ticket.getTickets());
	}
	
}
