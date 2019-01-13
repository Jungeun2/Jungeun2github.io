package ex2;

import java.util.*;

public class Ch03Ex03_04 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();
		
		int x = (int)a + (int)b + (int)c;
		int y = (int)((a + b + c) / 3);
		
		System.out.printf("%d %d %d", "sum", a, "avg", b);
		
	}
}