import java.util.Scanner;

public class Ch04Ex02_08 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		int a = 0, b = 0, c = 0;
		
			while(true) {
			a = scanner.nextInt();
			if(a==0) {
				break;
			} else {
				if(a%2==0) {
				b++;
			} else {
				c++;
			}
		}
	}
		System.out.println("odd: "+c);
		System.out.println("even: "+b);
		
	}
}