package ex2;

import java.util.*;

public class Ch03Ex02_02 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = a * b;
		
		a += 5;
		b *= 2;
		
		System.out.println("width = " + a);
		System.out.println("length = " + b);
		System.out.println("area = " + c);
		
	}
}