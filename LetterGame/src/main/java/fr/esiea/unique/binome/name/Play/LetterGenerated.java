package fr.esiea.unique.binome.name.Play;
import java.util.Random;


public class LetterGenerated {

	public char pickLetter(){
		Random rand = new Random();
		char letterPicked;
		String letters = "abcdefghijklmnopqrstuvwxyz";
		int longueur = letters.length();
		int k = rand.nextInt(longueur);
		letterPicked =letters.charAt(k);
		return letterPicked;
		
	}
	    
}
