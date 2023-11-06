import java.util.Scanner;

public class RomanToInteger {
	
	public static int romanToInteger(String s) {
		
		int result = 0;
		int prevValue = 0;
		
		
		for(int i=s.length()-1;i>=0;i--) {
			char currentChar = s.charAt(i);
			int currValue=0;
			
			switch(currentChar) {
				case 'I':currValue=1;
					break;
					
				case 'V':currValue=5;
				break;
				
				case 'X':currValue=10;
				break;
				
				case 'L':currValue=50;
				break;
				
				case 'C':currValue=100;
				break;
				
				case 'D':currValue=500;
				break;
				
				case 'M':currValue=1000;
				break;
				
			}
			if(currValue<prevValue) {
				result-=currValue;
			}else {
				result+=currValue;
			}
			prevValue=currValue;
		}
		return result;
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String input = scan.nextLine();
		
		
		int finalResult =romanToInteger(input);
		
		
		
		System.out.println(finalResult);

	}

}
