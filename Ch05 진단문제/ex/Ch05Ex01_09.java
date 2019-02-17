package ex;

import java.util.Scanner;

public class Ch05Ex01_09 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		int a[] = new int[10];
		
		for(int i=0; i<a.length; i++) {
			a[i] = scanner.nextInt();
		}
		
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i] < a[j]);
			
			int temp = a[j];
			a[j] = a[i];
			a[i] = temp;
			
			}
		}
	}
}