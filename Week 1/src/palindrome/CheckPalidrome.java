/**
 * 
 */
package palindrome;

/**
 * @author Adam
 *
 */

public class CheckPalidrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "A MAN A PLAN A CANAL PANAMA";
		String b = "No x in Nixon";

		System.out.println(checkPalindrome(a));
		System.out.println(checkPalindrome(b));
	}

	/**
		 * 
		 */

	public static boolean checkPalindrome(String str) {

		String noSpace = str.replaceAll("\\s", "");

		char[] c = new char[noSpace.length()];
		for (int i = 0; i < noSpace.length(); i++) {
			c[i] = noSpace.charAt(i);
		}

		for (int i = 0, l = noSpace.length() - 1; i < l; i++, l--) {
			if (Character.toLowerCase(c[i]) != Character.toLowerCase(c[l])) {
				return false;
			}
		}
		return true;

	}
}
