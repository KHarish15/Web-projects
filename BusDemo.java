
import java.util.*;
public class BusDemo
{
    String passengername;
    int busno;
    Date date;
    public static void main(String args[] )
    
    {
        ArrayList<Bus> buses=new ArrayList<Bus>();
        ArrayList<Booking> bookings=new ArrayList<Booking>();

        buses.add(new Bus(1,true,2));
        buses.add(new Bus(2,true,30));
        buses.add(new Bus(2,false,20));
        int useropt=1;
        Scanner in=new Scanner(System.in);
        for(Bus b:buses)
        {
            b.display();
        }
        while(useropt==1)
        {  
            
            System.out.println("1 to book and 2 to exit");
            useropt=in.nextInt();            
            if(useropt==1)
            {
                Booking booking=new Booking();
                if(booking.isAvailable(bookings,buses))
                {
                    bookings.add(booking);


                    System.out.println("your booking is confirmed");
                }
                else{
                     System.out.println("soory  bus is full!,try another bus or another date");
                }
                
            }
        }

    }

}