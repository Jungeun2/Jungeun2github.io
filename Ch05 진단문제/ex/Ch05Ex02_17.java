package ex;

import java.util.Scanner;

public class Ch05Ex02_17 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int a[][] = new int[5][3];
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<2; j++) {
				a[i][j] = scanner.nextInt();
				a[i][2] += a[i][j];
				a[4][j] += a[i][j];
				a[4][2] += a[i][j];
			}
		}
		
		System.out.printf("", a[0][2]/2 , a[1][2]/2 , a[2][2]/2 , a[3][2]/2 );
		System.out.printf("", a[4][0]/4 , a[4][1]/4 );
		System.out.printf("", a[4][2]/8 );
	}
}