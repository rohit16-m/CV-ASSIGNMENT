import java.util.Random;

public class ShuffleArray {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int[] numbers = {1,2,3,4,5,6,7};
		int length = numbers.length;
		
		System.out.println("Array before the shuffling :");
		
		for(int n:numbers) {
			System.out.print(n+" ");
		}
		
		for(int i=0;i<length;i++ ) {
			int randonIndex = random.nextInt(6);
			int temp =numbers[randonIndex];
			numbers[randonIndex]=numbers[i];
			numbers[i]=temp;
		}
		System.out.println("\nArray after the shuffling :");
		
		for(int n:numbers) {
			System.out.print(n+" ");
		}

	}

}
