package ex;

import java.util.Scanner;

public class Ch05Ex02_09 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int a[] = new int[100];
		int b=0, c=0;
		
		for(int i=0; i<100; i++) {
			a[i] = scanner.nextInt();
			if(a[i]==0) {
				
				break;
				
			} else {
				b++;
			if(a[i]%2==0) {
				a[i] = a[i]/2;
				
			} else {
				a[i] = a[i]*2;
			}
		}
	}
		System.out.printf("", b);
		
		for(int i=0; i<b; i++) {
			System.out.printf("%d ", a[i]);
		}
	}
}