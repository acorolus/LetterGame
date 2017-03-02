package fr.esiea.unique.binome.name.Play;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import fr.esiea.unique.binome.name.dictionary.Dictionary;

public class IA extends Player {

	public Dictionary dictionary;
	private ArrayList<String> listWord;

	public IA(Dictionary dictionary,String id, String name) {
		super(id,name);
		this.dictionary = dictionary;
		listWord = new ArrayList<String> ();
	}

	@Override
	public char pick(LetterGenerated g) {
		return (g.pickLetter());
	}
	
	public String findword() {
		String motlepluslong = "";
		for (String word : listWord) {
			if (dictionary.getDictionary().contains(word)) {
				if (motlepluslong.length() < word.length()) {
					motlepluslong = word;
				}
			}
		}
		return motlepluslong;
	}

	
	/*
	public Map<String, String> verifyword( ArrayList<String> lListPlayer, String word){
		Map<String,String> listword= new HashMap<String,String> ();
		boolean b;
		for (String s : lListPlayer){
			b=true;
			char[] wordtochar = s.toCharArray();
			for (int i=0;i < wordtochar.length;i++) {
				String character=""+wordtochar[i];
				if(!word.contains(character)){
					b= false;	
					i=wordtochar.length;
				}
			}			
			if(b == true){
				listword.put(word, s);
			}
			
		}
		return listword;
	}*/
	

	@Override
	
	public String makeword(LetterBag letterBag, ArrayList<String> lListPlayer) {
		long startTime = System.currentTimeMillis();
		listWord.clear();
		listWordsGenerator(letterBag.getlListOfLetterOnLetterBag(),lListPlayer);
		//listWordsGenerator(shareBag.getlListOfLetterOnLetterBag(),wordsfound);
		String result =findword();
		long endTime = System.currentTimeMillis();
		System.out.println("That took " + (endTime - startTime) + " milliseconds");
		return result;

	}
	
	
	public void listWordsGenerator(ArrayList<Character> lListOfLetterOnLetterBag,ArrayList<String> lListPlayer) {
		createwords(lListOfLetterOnLetterBag, "");
	}
	


public void createwords(ArrayList<Character> listelettres, String motforme) {
		
		String motformecopie = motforme;
		
		if (listelettres.isEmpty() == false) {
			
			for (int k = 0; k < listelettres.size(); k++) {
			
				ArrayList<Character> listelettrecopie = new ArrayList<Character>();
				listelettrecopie.addAll(listelettres);
				motformecopie = motforme + listelettres.get(k);
				
				for (int i=0; i<dictionary.getDictionary().size();i++){
					if (dictionary.getDictionary().get(i).startsWith(motformecopie)) {
						
						if (dictionary.getDictionary().contains(motformecopie)) {
							listWord.add(motformecopie);
						}
						
						if(listelettres.isEmpty() ==false){
							listelettrecopie.remove(k);
							createwords(listelettrecopie, motformecopie);
							i=dictionary.getDictionary().size();
						}
						
					
					}	
				
				}
				
			}
		}

	}

}
