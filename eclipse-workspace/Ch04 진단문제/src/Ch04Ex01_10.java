import java.util.Scanner;

public class Ch04Ex01_10 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int result = 0;
		
		if (a>b) {
			result = a-b;
			
		} else {
			result = b-a;
		}
		System.out.println(result);
	}
}