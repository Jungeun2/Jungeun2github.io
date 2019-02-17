package ex;

import java.util.Scanner;

public class Ch05Ex02_11 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int a[] = new int[6];
		int b = 0;
		
		for(int i=0; i<10; i++) {
			b = scanner.nextInt();
			if(b>=1 && b<=6) {
				a[(b-1)]++;
				
			} else {
				break;
			}
		}
		
		for(int i=1; i<7; i++) {
			System.out.printf("%d : %d\n", i,a[i-1]);
			
		}
	}
}