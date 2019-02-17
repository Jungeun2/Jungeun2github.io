package ex;

import java.util.Scanner;

public class Ch05Ex01_11 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int a[] = new int[10];
		int b = 0;
		
		for(int i=0; i<100; i++) {
			b = scanner.nextInt();
			if(b==0) {
				
				break;
				
			} else {
				a[b/10]++;
			}
		}
		
		for(int j=0; j<10; j++) {
			if(a[j] != 0) {
				System.out.printf("%d : %d\n", j,a[j]);
			}
		}
	}
}