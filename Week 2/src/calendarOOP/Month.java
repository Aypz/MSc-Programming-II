package calendarOOP;

public class Month {

	private String monthName;
	private int numDays;
	
	public Month(int month, boolean leapYear) {
		// TODO Auto-generated constructor stub
			switch (month) {
			case 1:
				monthName = "January";
				numDays = 31;
				break;
			case 2:
				monthName = "February";
				if (!leapYear){
					numDays = 28;
				} else {
					numDays = 29;
				}
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
			}
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
