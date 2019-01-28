package ex2;

import java.util.*;

public class Ch03Ex02_04 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		int a = scanner.nextInt(); // 민수의 키  
		int b = scanner.nextInt(); // 민수의 몸무게 
		
		int c = scanner.nextInt(); // 기영이의 키  
		int d = scanner.nextInt(); // 기영이의 몸무게  
		
		boolean x = a > c ? (b > d ? true : false) : true;
		
		System.out.println(x);
		
	}
}