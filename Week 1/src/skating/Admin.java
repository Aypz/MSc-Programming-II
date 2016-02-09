package skating;

public class Admin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double scores[] = { 1.1, 2.2, 3.3, 4.4, 5.5 };
		Skater one = new Skater("Noah", "Fence", scores);
		one.calculateScore(scores);
	}

}
