import java.util.Scanner;

public class Ch04Ex02_09 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		int a = 0, b = 0;
		
			while(true) {
			a = scanner.nextInt();
			
			if(a==0) {
			break;
			
			} else {
			if(a%3==0 || a%5==0) {
			continue;
			
			} else {
			b++;
			
			}
		}
	}
		System.out.printf("",+b);

	}
}