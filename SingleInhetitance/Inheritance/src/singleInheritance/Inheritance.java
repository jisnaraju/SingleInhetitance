package singleInheritance;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Inheritance{

	public static  void main(String[] args)throws IOException {
		int persons;
		int total_Days;
	    double tariff;
	    String roomType;
	    double  totalTariff;
	
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	SeasonBooking i=new SeasonBooking();
	System.out.println("    Booking     ");
	System.out.println();
	System.out.println("Enter the number of persons");
	persons=Integer.parseInt(br.readLine());
	i.setPersons(persons);
	System.out.println("Enter the number of days");
	total_Days=Integer.parseInt(br.readLine());
	i.setTotal_Days(total_Days);
	System.out.println("Enter the room type");
	roomType=br.readLine();
	i.setRoomType(roomType);
	System.out.println("Enter the tariff for single person");
	tariff=Double.parseDouble(br.readLine());
    i.setTariff(tariff);
    totalTariff=i.roomBooking(persons,total_Days,tariff,roomType);
    int  totalTariff1=(int) totalTariff;
    System.out.println("Total Tariff: "+totalTariff1);
    
    }

}
