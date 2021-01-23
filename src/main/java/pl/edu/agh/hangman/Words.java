import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Words {

	private ArrayList<String> words;

	public ArrayList<String> getWords() {
		return words;
	}

	public void setWords(ArrayList<String> words) {
		this.words = words;
	}

	public static void addWordsToTheList() throws IOException {

		ArrayList words = new ArrayList();
		BufferedReader read = new BufferedReader(new FileReader("slowa"));
		String line = read.readLine();


		while (line != null) {
			words.add(line);
			// line = reader.readline();
		}
	}


}


