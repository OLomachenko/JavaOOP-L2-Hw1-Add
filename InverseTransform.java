package hw1Additional;

public class InverseTransform extends TextTransformer {

	public String transform(String text) {
		StringBuilder temp = new StringBuilder(text);
		temp.reverse();
		String result = temp.toString();
		return result;
	}

}
