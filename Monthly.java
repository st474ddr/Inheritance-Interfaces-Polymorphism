
public class Monthly extends Appointment{

	public Monthly(int year, int month, int day, String description)
	{
	   super(year, month, day, description);
	}
	
	//確保都是之後的預約
	public boolean occursOn(int year, int month, int day)
	{
	   if (year < getYear())
	   {
	      return false;
	   }
	   if (month < getMonth() && year == getYear())
	   {
	      return false;
	   }
	   return day == getDay();
	}

	 public String toString() {
	        return getYear() + "/" + getMonth() + "/" + getDay() + "  " + super.toString() + " is Monthly";
	    }
}
