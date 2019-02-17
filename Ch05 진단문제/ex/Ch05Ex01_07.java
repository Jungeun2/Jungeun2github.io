package ex;

import java.util.Scanner;

public class Ch05Ex01_07 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int a[] = new int[10];
		int b=0, c=0;
		int d = 10000;
		
		for(int i=0; i<a.length; i++) {
			a[i] = scanner.nextInt();
			if(!(a[i]<=10000 && a[i]>=1)) {
				a[i]=100;
			}
		}
		for(int i=0; i<a.length; i++) {
			if(a[i]<100) {
				if(a[i]>b) {
					b=a[i];
				}
			} else if(a[i]>100) {
				if(a[i]<d) {
					d=a[i];
				}
			}
		}
		
		System.out.printf("%d %d",b,d);
	}
}