package ex2;

import java.util.*;

public class Ch03Ex01_01 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		int c = a + 100;
		int d = b % 10;
		
		System.out.printf("%d %d", c, d);

	}
}