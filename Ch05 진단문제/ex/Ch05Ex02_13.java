package ex;

import java.util.Scanner;

public class Ch05Ex02_13 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int a[] = new int[10];
		int b = 0;
		
		for(int i=0; i<2; i++) {
			a[i] = scanner.nextInt();
			System.out.printf("%d ",a[i]);
		}
		
		for(int i=2; i<10; i++) {
			a[i] = a[i-1] + a[i-2];
			if(a[i] >= 10) {
				System.out.printf("%d ", a[i]%10);
			} else {
				System.out.printf("%d ", a[i]);
			}
		}
	}
}