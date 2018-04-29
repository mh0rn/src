
public class Letter {
	
	private char letter;
	private boolean consonant;
	
	public Letter(char letter) {
		this.letter = letter;
		this.consonant = setConsonant();
	}
	
	public char getLetter() {
		return this.letter;
	}
	
	public boolean checkConsonant() {
		return consonant;
	}
	
	private boolean setConsonant() {
		if (letter == 'a' || letter == 'A') {
			return false; 
		} else if (letter == 'e' || letter == 'E') {
			return false;
		} else if (letter == 'i' || letter == 'I') {
			return false;
		} else if (letter == 'o' || letter == 'O') {
			return false;
		} else if (letter == 'u' || letter == 'U') {
			return false;
		} else {
			return true;
		}
	}
	
	
}
