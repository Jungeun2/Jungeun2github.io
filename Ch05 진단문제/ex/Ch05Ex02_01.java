package ex;

import java.util.Scanner;

public class Ch05Ex02_01 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		char a[] = new char[10];
		
		for(int i=0; i<10; i++) {
			a[i] = scanner.next().charAt(0);
		}
		
		for(int j=9; j>-1; j--) {
			System.out.printf("%c ", a[j]);
			
		}
	}
}