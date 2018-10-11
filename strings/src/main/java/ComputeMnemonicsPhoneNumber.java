import java.util.*;

public class ComputeMnemonicsPhoneNumber {

	/*
	 * 7.7
	 */
	private static final String[] MAPPING = { "0", "1", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ" };

	public static List<String> computeMnemonics(String phoneNumber) {
		char[] partialMnemonic = new char[phoneNumber.length()];
		List<String> mnemonicsList = new ArrayList<>();

		mnemonicsHelper(phoneNumber, 0, partialMnemonic, mnemonicsList);

		return mnemonicsList;
	}

	private static void mnemonicsHelper(String phoneNumber, int digit, char[] partialMnemonic,
			List<String> mnemonicsList) {
		if (digit == phoneNumber.length()) {
			mnemonicsList.add(new String(partialMnemonic));
		} else {
			for (int i = 0; i < MAPPING[phoneNumber.charAt(digit) - '0'].length(); i++) {
				partialMnemonic[digit] = MAPPING[phoneNumber.charAt(digit) - '0'].charAt(i);
				mnemonicsHelper(phoneNumber, digit + 1, partialMnemonic, mnemonicsList);
			}
		}
	}

}
