package calendarOOP;

public class CalendarMonth {

	private int day;
	private Month month;
	private String line = "";

	public CalendarMonth(int monthNum, int startDay, boolean leapYear) {
		// TODO Auto-generated constructor stub
		month = getMonth(monthNum, leapYear);
		this.day = startDay;
	}

	private Month getMonth(int month, boolean leapYear) {
		Month m = new Month(month, leapYear);
		return m;
	}

	public void print() {
		System.out.printf("%n%n" + month.getMonthName() + "%n");
		System.out.println("S	M	T	W	T	F	S");
		for (int i = 0; i < day; i++) {
			line = line + "	";
		}

		for (int i = 1; i <= month.getNumDays(); i++) {
			if (i + day != 7 && i + day != 14 && i + day != 21 && i + day != 28
					&& i + day != 35) {
				line = line + i + "	";
			} else {
				line = line + i + "%n";
			}
		}
		System.out.printf(line);
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	/**
	 * Adhoc tests
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CalendarMonth January = new CalendarMonth(1, 1, false);
		CalendarMonth February = new CalendarMonth(2, 4, false);

		January.print();
		February.print();
	}

}
