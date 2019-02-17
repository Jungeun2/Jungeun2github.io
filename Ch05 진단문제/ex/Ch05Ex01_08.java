package ex;

import java.util.Scanner;

public class Ch05Ex01_08 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int a[] = new int[10];
		int sum = 0;
		float avg = 0;
		
		for(int i=0; i<a.length; i++) {
			a[i] = scanner.nextInt();
			if(i%2==1) {
				sum += a[i];
			} else {
				avg += a[i];
			}
		}
		
		System.out.printf("sum : %d\navg : %.1f",sum,avg/5);
	}
}