package ex2;

import java.util.*;

public class Ch03Ex03_02 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int x = a / b;
		float y = (float)a / b;
		
		System.out.printf("%d %.2f", x, y);

	}
}