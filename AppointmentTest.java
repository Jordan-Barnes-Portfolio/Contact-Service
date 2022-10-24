import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

class AppointmentTest{

    public static void main(String args[]){

        Date date = new GregorianCalendar(2023, Calendar.JANUARY, 10).getTime();
        System.out.println(date);

        //creating appointment
        Appointment a = new Appointment("A1",date,"Appointment-1");

        System.out.println("Appointment created successfully!!");

    }

}