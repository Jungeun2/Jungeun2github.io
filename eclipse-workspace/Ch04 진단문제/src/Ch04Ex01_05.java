import java.util.Scanner;

public class Ch04Ex01_05 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		float a = scanner.nextFloat();
		float b = scanner.nextFloat();
	
		if(a>=4.0 && b>=4.0) {
			
			System.out.println("A");
			
		} else if(a>=3.0 && b>=3.0) {
			
			System.out.println("B");
		
		} else {
			
			System.out.println("C");
			
		}
	}
}