package ex2;

import java.util.*;

public class Ch03Ex02_01 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		int x = a / b;
		int y = a % b;
		
		System.out.printf("%d / %d = %d...%d", a, b, x, y);
		
	}
}