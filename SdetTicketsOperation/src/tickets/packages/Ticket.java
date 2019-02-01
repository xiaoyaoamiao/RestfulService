package tickets.packages;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name = "ticket")
public class Ticket implements Serializable {

   private static final long serialVersionUID = 1L;
   private int id;
   private String number;
   private boolean status;

   public Ticket(int id, String number, boolean status){
      this.id = id;
      this.number = number;
      this.status = status;
   }

   public int getId() {
      return id;
   }

   @XmlElement
   public void setId(int id) {
      this.id = id;
   }
   public String getNumber() {
      return number;
   }
   @XmlElement
   public void setName(String number) {
      this.number = number;
   }
   public boolean getStatus() {
      return status;
   }
   @XmlElement
   public void setStatus(boolean status) {
      this.status = status;
   }		
}