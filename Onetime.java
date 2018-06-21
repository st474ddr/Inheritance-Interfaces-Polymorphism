
public class Onetime extends Appointment{

	public Onetime(int year, int month, int day, String description)
	{
	   super(year, month, day, description);
	}
	 public String toString() {
	        return getYear() + "/" + getMonth() + "/" + getDay() + "  " + super.toString() + " is Onetime";
	    }
	
}
