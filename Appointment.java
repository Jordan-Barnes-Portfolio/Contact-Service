import java.util.Date;

class Appointment{

    final String ID;

    String description;

    Date date;

//constructor definition

    public Appointment(String ID, Date date, String description){

        Date currentDate = new Date();
        System.out.println(currentDate);

        if(date !=null && currentDate.before(date) )
            this.date = date; //if the input date is valid
        else{
            System.out.println("Invalid date");
            System.exit(0);
        }

        if(ID.length()>0 && ID.length()<=10)
            this.ID=ID;
        else{
            this.ID="";
            System.out.println("Invalid ID");
            System.exit(0);
        }
        if(description.length()>0 && description.length()<=50)
            this.description=description;
        else{
            System.out.println("Invalid description");
            System.exit(0);
        }
    }
}