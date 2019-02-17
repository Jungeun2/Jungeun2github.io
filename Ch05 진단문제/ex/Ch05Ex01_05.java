package ex;

import java.util.Scanner;

public class Ch05Ex01_05 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double a[] = {85.6, 79.5, 83.1, 80.0, 78.2, 75.0};
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		System.out.printf("%.1f", a[b-1] + a[c-1]);
	
	}
}