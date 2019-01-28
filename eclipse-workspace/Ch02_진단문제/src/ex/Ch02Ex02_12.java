package ex;

import java.util.*;

public class Ch02Ex02_12 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		int a = scanner.nextInt();
		double b = scanner.nextDouble();
		System.out.printf("%.2f * %d = %.0f",b,a,b*a);

	}
}