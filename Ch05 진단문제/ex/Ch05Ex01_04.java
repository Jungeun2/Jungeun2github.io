package ex;

import java.util.Scanner;

public class Ch05Ex01_04 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int a[] = new int[100];
		int b = 0;
		
		for(int i=0; i<a.length; i++) {
			a[i] = scanner.nextInt();
			if(a[i]==0) {
				b--;
				break;
			}
				b++;
		}
		
		for(int i=b; i>=0; i--) {
			System.out.printf("%d ", a[i]);
		}
	}
}