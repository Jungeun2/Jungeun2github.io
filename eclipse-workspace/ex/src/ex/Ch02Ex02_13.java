package ex;

import java.util.*;

public class Ch02Ex02_13 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		System.out.printf("sum = %d\n",a+b+c);
		System.out.printf("avg = %d",(a+b+c)/3);
		
	}
}