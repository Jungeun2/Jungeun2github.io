package ex;

import java.util.Scanner;

public class Ch05Ex01_06 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int a[] = new int[10];
		int b = 0;
		
		for(int i = 0; i<a.length; i++) {
			a[i] = scanner.nextInt();
			if(a[i]==1000) {
				break;
			} else if(b==0 || b>a[i]) {
				b=a[i];
			}
		}
		
		System.out.printf("%d", b);
	}
}