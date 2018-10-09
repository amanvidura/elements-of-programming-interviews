public class ReverseWordsInASentence {

	/*
	 * 7.6
	 */

	public static String reverseWordsInASentence(String input) {
		String[] inputArr = input.split(" ");

		for (int i = 0, mid = inputArr.length / 2; i < mid; i++) {
			String temp = inputArr[i];
			inputArr[i] = inputArr[inputArr.length - i - 1];
			inputArr[inputArr.length - i - 1] = temp;
		}

		return String.join(" ", inputArr);
	}
}
