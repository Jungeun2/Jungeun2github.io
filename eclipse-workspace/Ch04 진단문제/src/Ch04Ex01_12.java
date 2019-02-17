import java.util.Scanner;

public class Ch04Ex01_12 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int year = scanner.nextInt();
		String a = scanner.next();
		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
			a = "leap year";
		} else {
			a = "common year";
		}
		System.out.println(a);
		
	}
}