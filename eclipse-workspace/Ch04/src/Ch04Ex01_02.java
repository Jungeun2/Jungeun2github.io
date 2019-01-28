import java.util.Scanner;

public class Ch04Ex01_02 {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = b+100-a;
		
		if(c>0) {
			
			System.out.println(c);
			System.out.println("Obesity");
			
		} else {
			
			System.out.println(c);
			
		}
	}
}