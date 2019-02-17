import java.util.Scanner;

public class Ch04Ex02_11 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double a = 0, b = 0;
		String c = "y";
		while(c.charAt(0)=='y' || c.charAt(0)=='Y') {
			System.out.print("Base = ");
			a = scanner.nextDouble();
			
			System.out.print("Height = ");
			b = scanner.nextDouble();
			
			System.out.println("Triangle area = "+a*b/2);
			System.out.print("Continue? ");
			
			c = scanner.next();
			if(c.charAt(0)=='y' || c.charAt(0)=='Y') {
				
			} else {
				System.out.print("Continue? ");
				
			}
		}
	}
}