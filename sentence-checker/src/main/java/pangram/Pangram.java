package pangram;

import java.util.ArrayList;
import java.util.List;
import pangram.Alphabet;

public class Pangram
{
	private List<String> sentence;
	private boolean isPangram = false;
	private Alphabet alphabet = new Alphabet();

	public Pangram(){
		this.sentence = new ArrayList<String>();
		this.isPangram = false;
		this.alphabet = new Alphabet();
	}

	public Pangram(String word) {
		List<String> sentence = new ArrayList<String>();
		sentence.add(word);
		this.sentence = sentence;
	}


	public void setSentence(ArrayList<String> sentence){
		this.sentence = sentence;
	}

	public List<String> getSentence(){
		return this.sentence;
	}

	public void setIsPangram(boolean isPangram){
		this.isPangram = isPangram;
	}

	public boolean isPangram(){
		return this.isPangram;
	}

	public void setAlphabet( Alphabet alphabet ){
		this.alphabet = alphabet;
	}

	public Alphabet getAlphabet() {
		return this.alphabet;
	}

	public void pangramCheck(){
		for( String s : getSentence() ){
			getAlphabet().check(s);
			setIsPangram( getAlphabet().isFull() );
		}
	}

	public void printSentence(){
		String pangram = "";
		for (int i=0; i<sentence.size(); i++ ){
			pangram += sentence.get(i);
			if( i<sentence.size()-1 ){
				pangram += " ";
			} else {
				pangram += ".";
			}
		}
		System.out.println(pangram);
	}

}
