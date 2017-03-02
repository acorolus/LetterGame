package fr.esiea.unique.binome.name.Play;

import java.util.ArrayList;
import java.util.List;

//import com.sun.istack.internal.logging.Logger;

public class LetterBag {

   // private Logger mLogger = Logger.getLogger(LetterBag.class);
    private ArrayList<Character> lListOfLetterOnLetterBag;
    
    public LetterBag() {
    
        this.lListOfLetterOnLetterBag = new ArrayList<Character>();
  
    }

   /* public boolean addLetter(List<Character> pListOfletter) {
        if (pListOfletter == null || pListOfletter.isEmpty()) {
            return false;
        }
        for (Character lLetterToAdd : pListOfletter) {
            lListOfLetterOnSharedBag.add(lLetterToAdd);
            // Show the letter added to the shared Bag
         //   mLogger.info("letter added to the shared Bag: " + lLetterToAdd.toString());
        }
        return true;
    }*/
    
    public boolean addLetter(char pletter) {
    	if(pletter == '\u0000'){
    		return false;
    	}else{
    		lListOfLetterOnLetterBag.add(pletter);
    		return true;
    	}
    	    	
    }

    public boolean clearBag() {
        lListOfLetterOnLetterBag.clear();
        if (lListOfLetterOnLetterBag.isEmpty()) {
            return true;
        }
        return false;
    }
    
    public void removeLetters(String wordToRemove){
    	
    	for (char c : wordToRemove.toCharArray()) {
    		
    		for(int i = 0; i < lListOfLetterOnLetterBag.size(); i++)
    	    {
    	        if(lListOfLetterOnLetterBag.get(i)==c){
    	        	lListOfLetterOnLetterBag.remove(i);
    	        }
    	    }  		
    	}	
    }
    
   
   

    public ArrayList<Character> getlListOfLetterOnLetterBag(){
		return lListOfLetterOnLetterBag;
    	
    }
    
    
    public boolean verifyletters(String word){
    	boolean check=true;
    	for (char c : word.toCharArray()) { 
    		if(lListOfLetterOnLetterBag.contains(c)==false){
    			check=false;
    		}
    	} 
    	return check;
    }
    /*
    public boolean verifyletters(ArrayList<String>listword, String word){
    	
    	boolean check=true;
    	ArrayList<Character> allLetters= new ArrayList<Character> ();
    	allLetters.addAll(lListOfLetterOnLetterBag);
    	for(String s : listword){
    		char[] temp = s.toCharArray();
    		for (int i = 0;i<temp.length;i++){
    			String letter = ""+temp[i];
    			if(word.contains(letter)==false){
    				check=false;
    				i=temp.length;
    			}
    		}
    	 
    	}
    	
    	return check;
    }
     */

}
