/**
 * 
 */
package encryption;

/**
 * @author Adam
 *
 */
public class CaesarCipher {

	public CaesarCipher() {

	}

	public String encrypt(String s, int key) {
		String toReturn = "";
		String str = s;
		char[] charArray = str.toCharArray();
		for (char c : charArray) {
			c += key;
			toReturn += c;
		}
		return toReturn;
	}

	public String decrypt(String s, int key) {
		String toReturn = "";
		String str = s;
		char[] charArray = str.toCharArray();
		for (char c : charArray) {
			c -= key;
			toReturn += c;
		}
		return toReturn;
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CaesarCipher cipher = new CaesarCipher();
		System.out.println(cipher.encrypt("Adam", 8));
		System.out.println(cipher.decrypt("Iliu", 8));

		System.out
				.println(cipher
						.decrypt(
								"Jfy%Xqjju%Of{f%Wjujfy%2%gj%knwxy%yt%jrfnq%ymfy%yt%Fnifs%yt%|ns",
								5));
	}

	
}