package ex2;

import java.util.*;

public class Ch03Ex02_03 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		System.out.printf("%d %d\n", ++a, b--);
		System.out.printf("%d %d", a, b);
		
	}
}