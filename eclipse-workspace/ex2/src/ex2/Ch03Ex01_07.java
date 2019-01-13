package ex2;

import java.util.*;

public class Ch03Ex01_07 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		boolean x = a > b;
		boolean y = a > c;
		boolean z = x && y;
		
		boolean p = a == b;
		boolean q = a == c;
		boolean r = p && q;
		
		System.out.printf("%b %b", z, r);
		
	}
}