public class ReverseBits {

	/*
	 * 5.3
	 */

	public static int reverse(int x) {
		int wordSize = Integer.SIZE - 1;
		int reverse = 0;
		int mask = 1;

		for (int i = 0; i <= wordSize; i++) {
			if (((x >>> i) & 0x1) == 1)
				reverse ^= (mask << (wordSize - i));
		}

		return reverse;
	}
}
