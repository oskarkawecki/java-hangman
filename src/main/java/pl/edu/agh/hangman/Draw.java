package pl.edu.agh.hangman;

import java.util.Random;

public class Draw {
	
	private char[] draw(String [] words) {
		
		words = (String[]) Words.getWords().toArray();
		
		Random random = new Random();
		
		 int randomNumber = random.nextInt(words.length); //random.nextInt(10);
         char randomWordToGuess[] = words[randomNumber].toCharArray();
         
		return randomWordToGuess;	
		
	}

}
