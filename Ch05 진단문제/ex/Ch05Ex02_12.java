package ex;

import java.util.Scanner;

public class Ch05Ex02_12 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int a[] = new int[100];
		int b = 0;
		
		for(int i=0; i<100; i++) {
			b = scanner.nextInt();
			if(b==0) {
				break;
				
			} else {
				a[(b/10)]++;
			}
		}
		
		for(int i=10; i>-1; i--) {
			if(a[i] != 0) {
				System.out.printf("%d : %d\n", i*10, a[i]);
			}
		}
	}
}
