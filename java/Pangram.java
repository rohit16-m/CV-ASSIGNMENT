import javax.print.DocFlavor.STRING;

public class Pangram {
	
	public static boolean checkPangram(String input) {
		input = input.toLowerCase();

	    for (char letter = 'a'; letter <= 'z'; letter++) {
	        if (input.indexOf(letter) == -1) {
	            return false; 
	        }
	    }

	    return true;
		
	}

	public static void main(String[] args) {
		
		String input = "abcdefghi   jklmnopqrstuvwxyz";
		System.out.println(checkPangram(input));
		
		
		
		
		
		
	}
}
