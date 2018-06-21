import java.util.ArrayList;

public class Appointment {
	private int year, month, day;
	private String description;	
	
	public Appointment(int year, int month, int day, String description)
	{
	   this.year = year;
	   this.month = month;
	   this.day = day;
	   this.description = description;
	}
	
	public int getYear() {
		return year;
	}
	
	public int getMonth() {
		return month;
	}
	
	public int getDay() {
		return day;
	}
	
	
	public boolean occursOn(int year,int month, int day)
	{
		return ((year == this.year) && (month == this.month) && (day == this.day));
	}
	
	
	public static Appointment addAppointment(int y,int m,int d, String des, String type)
	{
		char[] t = type.toCharArray();
		Appointment App = new Appointment(y,m,d,des);
		if(t[0] == 'O' || t[0] == 'o')
			App = new Onetime(y,m,d,des);
		if(t[0] == 'D' || t[0] == 'd')
			App = new Daily(y,m,d,des);
		if(t[0] == 'M' || t[0] == 'm')
			App = new Monthly(y,m,d,des);
		return App;
	}
	
	public static void displayAppointment(int year, int month,int day, ArrayList<Appointment> appointments)
	{
		for(int i = 0; i < appointments.size(); i++)
		{
			if (appointments.get(i).occursOn(year, month, day))
			{
			   System.out.println(appointments.get(i));
			}
		}
	}
	  @Override
	    public String toString() {
	        //return "year=" + year + "month=" + month + "day=" + day + description;
		  return description;
	    }
	
}
