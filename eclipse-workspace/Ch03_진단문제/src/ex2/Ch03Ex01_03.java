package ex2;

import java.util.*;

public class Ch03Ex01_03 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		int x = a++;
		int y = --b;
		int z = x * y;
		
		System.out.printf("%d %d %d", x, y, z);
		
	}
}