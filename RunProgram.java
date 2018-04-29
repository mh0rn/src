import java.util.Scanner;

public class RunProgram {

	public static void main(String[]args) {
		Word word = new Word(prompt());
		
		System.out.println("" + word.toString());
		System.out.println("" + word.codeWord1().toString());
		System.out.println("" + word.codeWord2().toString());
		System.out.println("++Finish++");
	}
	
	private static String prompt() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a word to code in Rovarspraket > ");
		String wordInput = scanner.next();
		scanner.close();
		
		return wordInput;
		
	}
	

	
	
	
}
