import java.util.Scanner;

public class Ch04Ex02_02 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = 1;
		int c = 0;
		while(b <= a) {
			c = c + b++;
		}
		System.out.println(c);
	
	}
}