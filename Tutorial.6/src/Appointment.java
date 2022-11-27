import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
   An appointment.
*/
public class Appointment
{ 
   private String description;
   private AppointmentDate day;
   private AppointmentTime from;
   private AppointmentTime to;

   /*
      Add additional code here
   */
   ArrayList<Appointment> appointments = new ArrayList<>();
   public Appointment (String description, AppointmentDate day, AppointmentTime from, AppointmentTime to){
   this.description = description;
   this.day = day;
   this.from = from;
   this.to = to;
   }
   public AppointmentDate getDay(){
      return day;
   }

   public String format() {

   }

   public String AppointmentInfo(){
      String line = "" + description + ", " + day + ", " + from + ", " + to + ".";


      return line;
   }
}
