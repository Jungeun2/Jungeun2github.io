package ex2;

import java.util.*;

public class Ch03Ex01_06 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		boolean c = a != 0;
		boolean d = b != 0;
		
		System.out.printf("%b %b", c && d, c || d);
		
	}
}