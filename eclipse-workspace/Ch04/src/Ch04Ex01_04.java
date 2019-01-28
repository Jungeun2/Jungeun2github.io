import java.util.Scanner;

public class Ch04Ex01_04 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		float a = scanner.nextFloat();
		
		if(a<50.80) {
			System.out.println("Flyweight");
			
		} else if(a<61.23) {
			
			System.out.println("Lightweight");
			
		} else if(a<72.57) {
			
			System.out.println("Middleweight");
			
		} else if(a<88.45) {
			
			System.out.println("Cruiserweight");
			
		} else if(a>88.45) {
			
			System.out.println("Heavyweight");
			
		}
	}
}