import java.util.Scanner;
import java.util.ArrayList;

public class AppointmentTester {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		ArrayList<Appointment> appointments = new ArrayList<Appointment>();
	      appointments.add(new Daily(1996, 10, 20, "刷刷牙")); 
	      appointments.add(new Monthly(2014, 9, 20, "回家"));
	      appointments.add(new Onetime(2015, 11, 2, "看牙醫"));
	      appointments.add(new Onetime(2016, 4, 31, "去動物園"));
		while(true)
		{
			System.out.println("請輸入一個選擇   A/D (A for add; D for display)");
			Scanner first = new Scanner(System.in);
			char choose = (char) first.next().charAt(0);
			if(choose == 'A' || choose == 'a')
			{
				 System.out.println("輸入一個要新增的appointment :");
			      Scanner in = new Scanner(System.in);
			      int year = in.nextInt();
			      int month = in.nextInt();
			      int day = in.nextInt();
			      String description = in.nextLine();
			      String type = in.nextLine();
			 	  appointments.add(Appointment.addAppointment(year,month,day,description,type));
			}
			else if(choose == 'D' || choose == 'd')
			{
				 System.out.println("輸入一個日期 :");
				 Scanner in = new Scanner(System.in);
			      int year = in.nextInt();
			      int month = in.nextInt();
			      int day = in.nextInt();
			      Appointment.displayAppointment(year,month,day,appointments);
			}
			else
			{
				System.out.println("輸入錯誤請再次輸入 ");
			}
	}
}

}
