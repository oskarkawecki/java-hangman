package pl.edu.agh.hangman;

import java.io.*;
import java.util.*;
public class Words{

  private static ArrayList<String> words;

  public static ArrayList<String> getWords() {
	return words;
}

  public void setWords(ArrayList<String> words) {
	this.words = words;
}
  public static void addWordsToTheList() throws IOException{

  ArrayList<String> words = new ArrayList<>();
  BufferedReader read = new BufferedReader(new FileReader("arc/main.resources/slowa.txt"));
  String line = read.readLine();


    while (line != null){
      words.add(line);
      //line = reader.readline();
    }
  }
}

