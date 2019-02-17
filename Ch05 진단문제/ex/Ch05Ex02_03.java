package ex;

import java.util.Scanner;

public class Ch05Ex02_03 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int a[] = new int[10];
		int b=0, c=0;
		
		for(int i=0; i<10; i++) {
			a[i] = scanner.nextInt();
			if(i%2==0) {
				b += a[i];
			} else {
				c += a[i];
			}
		}
		
		System.out.printf("odd : %d\n", b);
		System.out.printf("even : %d",  c);
		
	}
}