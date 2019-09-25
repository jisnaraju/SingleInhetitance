package singleInheritance;

class SeasonBooking extends Booking{
	
		public double roomBooking(int persons,int total_Days, double tariff, String roomType)
		{
		     return super.roomBooking(persons, total_Days, tariff, roomType);
		      
			
		}


	}
