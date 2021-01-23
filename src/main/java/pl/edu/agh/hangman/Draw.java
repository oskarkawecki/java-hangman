package pl.edu.agh.hangman;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Draw {
	
	public char[] draw() throws IOException {
		
		Words w = new Words();
		w.addWordsToTheList();
		
		ArrayList<String> words = w.getWords();
		
		Random random = new Random();
		
		 int randomNumber = random.nextInt(words.size());
         char randomWordToGuess[] = words.get(randomNumber).toCharArray();
         
		return randomWordToGuess;	
		
	}

}
