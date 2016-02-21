package commandArgs;

public class Args {

	public Args() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Integer[] argument = new Integer[args.length];

	// TODO Auto-generated method stub
		for (int i = 0; i < args.length; i++) {
			if (checkValues(args[i])){
				System.out.printf("Added %s%n", args[i]);
				argument[i]=new Integer(args[i]);
			} else {
				System.out.println("Check values");
			}
			
		}
	}

	public static boolean checkValues(String s) {
		boolean allowed = false;
		switch (s) {
		case "0":
		case "1":
		case "2":
		case "3":
		case "4":
		case "5":
		case "6":
		case "7":
		case "8":
		case "9":
			allowed = true;
			break;
		default:
			allowed = false;
		}
		return allowed;
	}

}
