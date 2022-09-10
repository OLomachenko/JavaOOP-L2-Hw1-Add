package hw1Additional;

import java.util.Arrays;

public class UpDownTransformer extends TextTransformer {

	public String transform(String text) {
		String result = "";
		char[] temp = new char[text.length()];
		for (int i = 0; i < temp.length; i++) {
			temp[i] = text.charAt(i);
			if (i % 2 == 0) {
				String letter = String.valueOf(temp[i]).toUpperCase();
				temp[i] = letter.charAt(0);
			} else {
				String letter = String.valueOf(temp[i]).toLowerCase();
				temp[i] = letter.charAt(0);
			}
		}
		result = Arrays.toString(temp);
		return result;
	}
}
