import java.util.Scanner;

public class Ch04Ex01_09 {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int result = 0;
		
		result = (a > b) ? a : b;
		result = (a < b) ? a : b;
		result = (b > c) ? b : c;
		result = (b < c) ? b : c;
		result = (a > c) ? a : c;
		result = (a < c) ? a : c;
		
		System.out.println(result);
		
	}
}