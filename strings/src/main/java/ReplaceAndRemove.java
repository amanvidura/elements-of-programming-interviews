public class ReplaceAndRemove {

	/*
	 * 7.4
	 */

	public static String replaceAndRemove(char[] s, int k) {
		int writeIdx = 0, aCount = 0;
		k = s.length;

		for (int i = 0; i < k; i++) {
			if (s[i] != 'b' && ((int) s[i]) != 32)
				s[writeIdx++] = s[i];

			if (s[i] == 'a')
				++aCount;
		}

		writeIdx--;
		int currIdx = writeIdx;

		writeIdx += aCount;

		for (int i = currIdx; i >= 0; i--) {
			if (s[i] == 'a') {
				s[writeIdx--] = 'd';
				s[writeIdx--] = 'd';
			}
			else {
				s[writeIdx--] = s[i];
			}
		}

		return new String(s);
	}

}
