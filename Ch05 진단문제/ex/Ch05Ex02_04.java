package ex;

import java.util.Scanner;

public class Ch05Ex02_04 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int a[] = new int[100];
		int b=0;
		
		for(int i=0; i<100; i++) {
			a[i] = scanner.nextInt();
			b=i;
			if(a[i]==-1) {
				break;
			}
		}
			if(b<4) {
				for(int j=0; j<b; j++) {
					System.out.printf("%d ", a[j]);
				}
				
			} else {
				for(int j=b-3; j<b; j++) {
					System.out.printf("%d ", a[j]);
			}
		}
	}
}