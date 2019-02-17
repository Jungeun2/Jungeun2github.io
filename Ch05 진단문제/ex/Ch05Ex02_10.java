package ex;

import java.util.Scanner;

public class Ch05Ex02_10 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int a[] = new int[20];
		int b = scanner.nextInt();
		
		for(int i=0; i<b; i++) {
			a[i] = scanner.nextInt();
		}
		
		for(int i=0; i<b; i++) {
			for(int j=0; j<b; j++) {
				if(a[i]>a[j]) {
					int tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
				}
			}
		}
		
		for(int i=0; i<b; i++) {
			System.out.println(a[i]);
		}
	}
}