
public class Daily extends Appointment{

	public Daily(int year, int month, int day, String description)
	{
	   super(year, month, day, description);
	}
	
	//確保都視之後的預約
	public boolean occursOn(int year, int month, int day)
	{
	   if (year > getYear())
	   {
	      return true;
	   }
	   if (year == getYear())
	   {
	      if (month > getMonth())
	      {
	         return true;
	      }
	      if (month == getMonth())
	      {
	         if (day >= getDay())
	         {
	            return true;
	         }
	      }
	   }
	   return false;
	}
	 public String toString() {
	        return getYear() + "/" + getMonth() + "/" + getDay() + "  " + super.toString() + " is Daily";
	    }
}
