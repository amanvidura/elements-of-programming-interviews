public class FindClosestInteger {

	/*
	 * 5.4
	 */

	public static long closestIntSameBitCount(long x) {
		final int bits = 63;

		for (int i = 0; i < bits; i++) {
			if (((x >>> i) & 1) != ((x >>> (i + 1)) & 1)) {
				x ^= (1L << i) | (1L << (i + 1));
				break;
			}
		}

		return x;
	}
}
