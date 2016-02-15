/**
 * 
 */
package calendar;

/**
 * @author Adam
 *
 */
public class CalendarMonth {

	private int month;
	private int day;
	private boolean leapYear;
	private String monthName;
	private int numDays;
	private int febLeap = 13;
	private String line = "";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CalendarMonth January = new CalendarMonth(1, 3, false);
		CalendarMonth July = new CalendarMonth(7, 6, false);
		CalendarMonth Feb = new CalendarMonth(2, 6, false);
		CalendarMonth FebLeap = new CalendarMonth(2, 6, true);

		January.print();
		July.print();
		Feb.print();
		FebLeap.print();

	}

	/**
	 * 
	 */
	public CalendarMonth() {
		// TODO Auto-generated constructor stub

	}

	public CalendarMonth(int month, int day, boolean leapYear) {
		if (leapYear && month == 2) {
			setMonth(febLeap);
		} else {
			setMonth(month);
		}
		this.day = day;
	}

	public void print() {
		System.out.printf("%n%n" + monthName);
		System.out.println();
		System.out.println("S	M	T	W	T	F	S");
		for (int i = 0; i < day; i++) {
			line = line + "	";
		}

		for (int i = 1; i <= numDays; i++) {
			if (i + day != 7 && i + day != 14 && i + day != 21 && i + day != 28
					&& i + day != 35) {
				line = line + i + "	";
			} else {
				line = line + i + "%n";
			}
		}
		System.out.printf(line);

	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		switch (month) {
		case 1:
			monthName = "January";
			numDays = 31;
			break;
		case 2:
			monthName = "February";
			numDays = 28;
			break;
		case 3:
			monthName = "March";
			numDays = 31;
			break;
		case 4:
			monthName = "April";
			numDays = 30;
			break;
		case 5:
			monthName = "May";
			numDays = 31;
			break;
		case 6:
			monthName = "June";
			numDays = 30;
			break;
		case 7:
			monthName = "July";
			numDays = 31;
			break;
		case 8:
			monthName = "August";
			numDays = 31;
			break;
		case 9:
			monthName = "September";
			numDays = 30;
			break;
		case 10:
			monthName = "October";
			numDays = 31;
			break;
		case 11:
			monthName = "November";
			numDays = 30;
			break;
		case 12:
			monthName = "December";
			numDays = 31;
			break;
		case 13:
			monthName = "February";
			numDays = 29;
			break;
		}
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public boolean isLeapYear() {
		return leapYear;
	}

	public void setLeapYear(boolean leapYear) {
		this.leapYear = leapYear;
	}

	public String getMonthName() {
		return monthName;
	}

	public void setMonthName(String monthName) {
		this.monthName = monthName;
	}

	public int getNumDays() {
		return numDays;
	}

	public void setNumDays(int numDays) {
		this.numDays = numDays;
	}

}
