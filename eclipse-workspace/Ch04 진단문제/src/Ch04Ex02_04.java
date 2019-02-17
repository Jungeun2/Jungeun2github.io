import java.util.Scanner;

public class Ch04Ex02_04 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int a = 0, b = 0, c = 0;
		
			while( a < 100) {
			a = scanner.nextInt();
			b+=a;
			c++;
		}
			System.out.println(b);

	}
}