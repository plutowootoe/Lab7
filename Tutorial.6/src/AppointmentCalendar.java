import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
   An appointment calendar.
*/
public class AppointmentCalendar {
   private ArrayList<Appointment> appointments;

   public ArrayList<Appointment> getAppointmentsForDay(AppointmentDate day) {
      ArrayList<Appointment> specificDate = new ArrayList<>();

      for (int i = 0; i < appointments.size(); i++)
         if (appointments.get(i).getDay().equals(day)) {
            specificDate.add(appointments.get(i));
         }
      return specificDate;
   }

   public Appointment addAppointment(String description, AppointmentDate day, AppointmentTime from, AppointmentTime to) {
      Appointment NewAppointment = new Appointment(description, day, from, to);
      appointments.add(NewAppointment);
      return NewAppointment;
   }

   public Appointment cancel(String description, AppointmentDate day, AppointmentTime from, AppointmentTime to) {
      Appointment OldAppointment = new Appointment(description,day,from,to);
      appointments.remove(OldAppointment);
      return OldAppointment;
   }

}
  
