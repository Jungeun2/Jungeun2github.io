package ex;

import java.util.*;

public class Ch02Ex02_01 {

	public static void main(String[] args) {
		
		int sum = 90 + 80 + 100;
		int avg = (90 + 80 + 100) / 3;
		
		Scanner scanner = new Scanner (System.in);
		System.out.print("kor ");
		String input = scanner.nextLine();
		
		System.out.print("mat ");
		String input2 = scanner.nextLine();
		
		System.out.print("eng ");
		String input3 = scanner.nextLine();
	
		System.out.println("sum "+sum);
		System.out.print("avg "+avg);
		
	}
}