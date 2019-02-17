package ex;

import java.util.Scanner;

public class Ch05Ex02_18 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		char a[][] = new char[3][5];
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<5; j++) {
				a[i][j] = scanner.next().charAt(0);
			}
		}
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<5; j++) { 
				System.out.printf("%c ", a[i][j]+32);
				
			}
			
				System.out.println();
		}
	}
}