package ex;

import java.util.Scanner;

public class Ch05Ex02_07 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int a[] = new int[100];
		int b = 1000;
		int c = -1000;
		
		for(int i=0; i<100; i++) {
			a[i] = scanner.nextInt();
			if(a[i]==999) {
				
				break;
				
			} else {
				
				b = (a[i]<b) ? a[i]:b;
				c = (a[i]>c) ? a[i]:c;
			}
		}
		
		System.out.printf("max : %d\n", c);
		System.out.printf("min : %d", b);
		
	}
}