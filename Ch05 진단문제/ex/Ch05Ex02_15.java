package ex;

import java.util.Scanner;

public class Ch05Ex02_15 {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		int a[][] = new int[4][4];
		
		for(int i=0; i<4; i++) {
			System.out.printf("%dclass? ", i+1);
			for(int j=0; j<3; j++) {
				
				a[i][j] = scanner.nextInt();
				a[i][3] += a[i][j];
			}
		}
		
		for(int i=0; i<4; i++) {
			System.out.printf("%dclass : %d\n", i+1, a[i][3]);
		}
	}
}