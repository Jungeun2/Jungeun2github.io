package ex2;

import java.util.*;

public class Ch03Ex03_01 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		int x = (int)(a * b); // 두 수를 각각 정수로 변환  
		int y = (int)a * (int)b; // 두 수를 각각 정수로 변환  
		
		System.out.printf("%d %d", x, y);
		
	}
}