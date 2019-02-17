package ex;

import java.util.Scanner;

public class Ch05Ex02_08 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int a[] = new int[100];
		int b=0, c=0;
		
		for(int i=0; i<100; i++) {
			a[i] = scanner.nextInt();
			if(a[i]==0) {
				break;
			} else {
				if(a[i]%5==0) {
					b++;
					c += a[i];
				}
			}
		}
		
		System.out.printf("Multiples of 5 : %d\n", b);
		System.out.printf("sum : %d\n",  c);
		System.out.printf("avg : %.1f", (float) c/b);

	}
}