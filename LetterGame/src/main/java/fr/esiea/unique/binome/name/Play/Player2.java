package fr.esiea.unique.binome.name.Play;

import java.util.ArrayList;
import java.util.Scanner;

public class Player2 {
	private String id;
	private String name;
	public ArrayList<Character> currentLetters;
	public ArrayList<String> wordsfound;
	public boolean bWordFound;
	

	
	public Player2 (String id, String name){
		currentLetters=new ArrayList<Character>();
		wordsfound= new ArrayList<String>();
		this.id = id;
		this.name = name;
		this.bWordFound =false;
	}
	
	public String toString(){
		return name;
	}
	
	public boolean getbWordFound(){
		return(this.bWordFound);
	}
	
	public void setbWordFound(boolean b){
		this.bWordFound = b;
	}
	
	public ArrayList<String> getWordsFound(){
		return wordsfound;
		
	}
	
	public void addword(String pword){
		wordsfound.add(pword);
	}
	
	public char pick(LetterGenerated g){		
		return(g.pickLetter());
	}

public String makeword(LetterBag sharedbag, ArrayList<String> lListPlayer) {
		
		String entry="";
		System.out.println("Your list : "+getWordsFound());
		System.out.println("enter the word : ");		
		Scanner scan=new Scanner(System.in);
		entry=scan.next();
		 return entry;
		
	}

}
