package ex;

import java.util.Scanner;

public class Ch05Ex01_01 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		char a[] = new char[10];
		int b = scanner.nextInt();
		
		for(int i=0; i<a.length; i++) {
			a[i] = b(i);
		}
		for(int j=0; j<a.length; j++) {
			System.out.printf("%c", a[j]);
		}
	}

	private static char b(int i) {
		return 0;
	}
}