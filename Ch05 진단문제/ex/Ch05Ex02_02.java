package ex;

import java.util.Scanner;

public class Ch05Ex02_02 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int a[] = new int[5];
		int sum=0;
		
		
		for(int i=0; i<5; i++) {
		a[i] = scanner.nextInt();
		if(i%2==0) {
			
			sum += a[i];
			
		}
	}
		System.out.printf("%d", sum);
	
	}
}