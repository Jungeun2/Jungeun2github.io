package ex;

import java.util.Scanner;

public class Ch05Ex01_12 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int a[] = new int[100];
		int b = scanner.nextInt();
		a[0] = 100;
		a[1] = b;
		System.out.printf("100 %d",b);
			
		for(int i=2; i<100; i++) {
			if(a[i-1]>=0) {
				a[i] = a[i-2]-a[i-1];
				
				System.out.printf("%d ",a[i]);
			} else {break;}
		}
	}
}