/**
 * 
 */
package jUnit;

/**
 * @author Adam
 *
 */
public class MonthTranslator {

	public String trans(int month) {
		String monthWord;
		switch (month) {
		case 1:
			monthWord = "Jan";
			break;
		case 2:
			monthWord = "Feb";
			break;
		case 3:
			monthWord = "Mar";
			break;
		case 4:
			monthWord = "Apr";
			break;
		default:
			monthWord = "Unknown";
			break;
		}
		return monthWord;
	}

}
