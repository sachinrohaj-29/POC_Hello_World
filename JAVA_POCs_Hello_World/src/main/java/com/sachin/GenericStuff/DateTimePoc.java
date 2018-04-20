package com.sachin.GenericStuff;

/*public class DateTimePoc {	
	
	public static void main(String arg[]){
	
		String inputDate = "2017-01-01";
		String inputTime = "12:00:00";
		String inputTime1 = "12:00:01";
		LocalDate date = dateFromatter(inputDate);
		LocalTime time = timeFormatter(inputTime);
		LocalTime time1 = timeFormatter(inputTime1);
		
		System.out.println(date.minusDays(1));
		
		if(time.equals(time1))
			System.out.println(time.minusSeconds(1));
		
	}

	private static LocalTime timeFormatter(String time) {
		// TODO Auto-generated method stub
		DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("HH:mm:ss");		
		return LocalTime.parse(time, timeFormat);
	}

	private static LocalDate dateFromatter(String date) {
		// TODO Auto-generated method stub
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd"); //("yyyy-MM-dd");
		return LocalDate.parse(date, dateFormat);
	}	
}
*/

public class DateTimePoc {
	public static void main(String argv[]) {
		AA a = new AA();
		a.start();
		synchronized (a) {
			System.out.println("waiting");
			try {
				a.wait();
			} catch (InterruptedException e) {

			}
			System.out.println(a.count);
		}

	}

}

class AA extends Thread {
	int count = 0;

	public void run() {
		System.out.println("run");
		synchronized (this) {
			for (int i = 0; i < 50; i++) {
				count = count + i;
			}
			notify();
		}
	}
}

