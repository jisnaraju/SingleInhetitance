package singleInheritance;

    public class Booking {
	private int persons;
	private int total_Days;
	private double tariff;
	private String roomType;
	double totalTariff;
	public int getPersons() {
		return persons;
	}
	public void setPersons(int persons) {
		this.persons = persons;
	}
	public int getTotal_Days() {
		return total_Days;
	}
	public void setTotal_Days(int total_Days) {
		this.total_Days = total_Days;
	}
	public double getTariff() {
		return tariff;
	}
	public void setTariff(double tariff) {
		this.tariff = tariff;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	
	public double roomBooking(int persons, int total_Days, double tariff, String roomType)
	{
	      double totalTariff=getTariff()*getTotal_Days()*getPersons();
	      return totalTariff;
	      
		
	}

}
