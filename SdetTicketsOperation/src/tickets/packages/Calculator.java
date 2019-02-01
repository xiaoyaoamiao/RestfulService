package tickets.packages;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/CalculationService")
public class Calculator {

     @GET
     @Path("/add")
     @Produces(MediaType.TEXT_PLAIN)
     public double Add(@QueryParam("x") double x,@QueryParam("y") double y) {
      return x+y;  
     }  

     @GET
     @Path("/sub")
     @Produces(MediaType.TEXT_PLAIN)
     public double Sub(@QueryParam("x") double x,@QueryParam("y") double y) {
      return x-y;  
     }  

     @GET
     @Path("/mul")
     @Produces(MediaType.TEXT_PLAIN)
     public double Mul(@QueryParam("x") double x,@QueryParam("y") double y) {
      return x*y;  
     }  

     @GET
     @Path("/div")
     @Produces(MediaType.TEXT_PLAIN)
     public double Div(@QueryParam("x") double x,@QueryParam("y") double y) {
      return x/y;  
     }  

}