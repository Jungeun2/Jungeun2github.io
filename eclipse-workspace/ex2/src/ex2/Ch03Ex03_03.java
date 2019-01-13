package ex2;

import java.util.*;

public class Ch03Ex03_03 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		float x = (float) ((a + b + c) / 3.0);
		
		System.out.printf("%.1f", x);

	}
}