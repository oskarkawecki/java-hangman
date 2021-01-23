package pl.edu.agh.hangman;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class Words{

  private ArrayList<String> words;

  public ArrayList<String> getWords() {
	return words;
}

  public void setWords(ArrayList<String> words) {
	this.words = words;

}
  public void addWordsToTheList() throws IOException{
  InputStream is = getClass().getClassLoader().getResourceAsStream("file.txt");
  ArrayList<String> words = new ArrayList<>();
  BufferedReader read = new BufferedReader(new FileReader("todo"));
  String line = read.readLine();
  

    while (line != null){
      words.add(line);
      //line = reader.readline();
    }
  }
}

