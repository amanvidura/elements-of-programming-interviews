public class PalindromeAlphanumeric {

	/*
	 * 7.5
	 */

	public static boolean isPalindrome(String input) {
		String inputLC = input.toLowerCase();
		
		int i = 0, j = inputLC.length() - 1;

		while (i < j) {
			char iChar = inputLC.charAt(i), jChar = inputLC.charAt(j);

			while ((i < j) && !isLetterOrDigit(iChar)) {
				i++;
				iChar = inputLC.charAt(i);
			}

			while ((i < j) && !isLetterOrDigit(jChar)) {
				j--;
				jChar = inputLC.charAt(j);
			}

			if (iChar != jChar)
				return false;

			i++;
			j--;
		}

		return true;
	}

	private static boolean isLetterOrDigit(char c) {
		return (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9');
	}
}
