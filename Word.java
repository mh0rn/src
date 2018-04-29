
public class Word {

	private String word;
	
	public Word(String inputWord) {
		this.word = inputWord;
	}
	
	/**
	* Version of algorithm that does not use Letter class
 	* @return
 	*/
	public String codeWord1(){
		String codeWord = ""; //create new code word from scratch
		//System.out.println(codeWord.toString());
		    
		for(int i = 0; i < word.length(); i++) {
			String testLetter = word.substring(i, i + 1); //for each letter

			if(checkConsonant(testLetter)) { //if letter is a consonant
				codeWord = codeWord + testLetter + "o" + testLetter; //code letter
			} else { //if letter is a vowel
				codeWord = codeWord + testLetter; //leave vowel as is
			}
			
		}
		
		return codeWord;
	}
	
	/**
	 * Version of algorithm that does use Letter class
	 * @return
	 */
	public String codeWord2(){
		String codeWord = ""; //create new code word from scratch
		
		for(int i = 0; i < word.length(); i++) {
			Letter testLetter = new Letter(word.charAt(i)); //for each letter
			
			if(testLetter.checkConsonant()) { //if letter is a consonant
				codeWord = codeWord + testLetter.getLetter() + "o"; //code letter
				codeWord = codeWord + testLetter.getLetter();
				
			} else { //if letter is a vowel
				codeWord = codeWord + testLetter.getLetter();
			}
		}
		
		return codeWord;
	}
	
	/**
	 * Returns the word as a String object
	 */
	public String toString() {
		return word;
	}
	
	/**
	 * Checks if given String letter is a consonant
	 */
	private boolean checkConsonant(String letter) {
		if (letter.equals("a") || letter.equals("A")) {
			return false; 
		} else if (letter.equals("e") || letter.equals("E")) {
			return false;
		} else if (letter.equals("i") || letter.equals("I")) {
			return false;
		} else if (letter.equals("o") || letter.equals("O")) {
			return false;
		} else if (letter.equals("u") || letter.equals("U")) {
			return false;
		} else {
			return true;
		}
	}
}
