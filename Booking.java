import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class Booking {

  String passengername;
  int busno;
  Date date;
  Booking()
  {
    System.out.println("enter the passenger name");
    Scanner in= new Scanner(System.in);
    passengername=in.nextLine();
    System.out.println("enter the busno");
    busno=in.nextInt();
    in.nextLine();
    System.out.println("enter date dd-mm-yyyy");
    String dateinput=in.nextLine();
    SimpleDateFormat dateformat=new SimpleDateFormat("dd-MM-yyyy");
     try{
      date=dateformat.parse(dateinput);
    }
    catch(ParseException e)
    {
        e.printStackTrace();
    }
}
    public boolean isAvailable(ArrayList<Booking> bookings,ArrayList<Bus> buses)
    {
        int capacity=0;
        for(Bus bus:buses)
        {
            if(bus.getbusno()==busno)
            {
                capacity=bus.getcapacity();
                break;

            }
        }
        int booked=0;
        for(Booking b:bookings)
        {
            if(b.busno==busno && b.date.equals(date))
            {
               booked++;
            }
        }
        return booked<capacity?true:false;
    }
  }

