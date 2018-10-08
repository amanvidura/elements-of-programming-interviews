public class SpreadsheetColumnEncoding {

	/*
	 * 7.3
	 */

	public static int decodeSpreadsheetColumn(String code) {
		int result = 0, c = 0, base = 26;;

		for (int i = 0; i < code.length(); i++) {
			c = code.charAt(i) - 'A' + 1;
			result = result * base + c;
		}

		return result;
	}

}
