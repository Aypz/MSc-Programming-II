package skating;

public class Skater {
	
	private String firstName;
	private String lastName;

	public Skater(String firstName, String lastName, double[] scores) {
		// TODO Auto-generated constructor stub
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public void calculateScore(double[] scores) {
		double highScore = scores[0];
		double lowScore = scores[0];
		double total = 0;

		for (double a : scores) {
			if (a >= highScore) {
				highScore = a;
			}
			if (a <= lowScore) {
				lowScore = a;
			}
			total += a;
		}
		total -= highScore;
		total -= lowScore;
		double avg = total / 3;
		System.out.println(avg);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


}
