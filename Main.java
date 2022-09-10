package hw1Additional;

import java.io.File;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, enter your text: ");
		String text = sc.nextLine();
		System.out.println();
		
		TextTransformer basicTransformer = new TextTransformer();
		TextTransformer inverse = new InverseTransform();
		TextTransformer upDown = new UpDownTransformer();
		TextSaver saver = new TextSaver();
		

		
		System.out.println(basicTransformer.transform(text));
		System.out.println(inverse.transform(text));
		System.out.println(upDown.transform(text));
		
		File file = new File ("TextTransformer.txt");
		saver.setFile(file);
		saver.setTransform(upDown); //Выбор метода трансформации текста.
		
		saver.saveToFile(text);
		sc.close();
	}

}
