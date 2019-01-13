package ex2;

import java.util.*;

public class Ch03Ex01_05 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		System.out.printf("%d > %d --- %b\n", a, b, a>b);
		System.out.printf("%d < %d --- %b\n", a, b, a<b);
		System.out.printf("%d >= %d --- %b\n", a, b, a>=b);
		System.out.printf("%d <= %d --- %b\n", a, b, a<=b);

	}
}