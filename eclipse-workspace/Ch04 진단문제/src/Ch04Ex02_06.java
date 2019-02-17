import java.util.Scanner;

public class Ch04Ex02_06 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int a = 1;
		while(0 < a & a < 5) {
			System.out.printf("1. Korea 2. USA 3. Japan 4. China number? ");
			a = scanner.nextInt();
			if(a==1) System.out.printf("Seoul\n");
			else if(a==2) 
				System.out.printf("Washington\n");
			else if(a==3) 
				System.out.printf("Tokyo\n");
			else if(a==4) 
				System.out.printf("Beijing\n");
			else {
				System.out.printf("none");
				break;
			
			}
		}
	}
}