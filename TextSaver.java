package hw1Additional;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TextSaver {
	private TextTransformer transform;
	private File file;

	public TextSaver(TextTransformer transform, File file) {
		super();
		this.transform = transform;
		this.file = file;
	}

	public TextSaver() {
		super();
	}

	public TextTransformer getTransform() {
		return transform;
	}

	public void setTransform(TextTransformer transform) {
		this.transform = transform;
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public void saveToFile(String text) {
		String result = transform.transform(text);

		try (PrintWriter pw = new PrintWriter(file)) {
			pw.println(result);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
}
