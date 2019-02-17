package ex;

import java.util.Scanner;

public class Ch05Ex02_05 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int a[] = new int[6];
		float b=0;
		
		for(int i=0; i<6; i++) {
			float c = scanner.nextFloat();
			b += c;
		}
		
		System.out.printf("%.1f", b/6);

	}
}