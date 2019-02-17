package ex;

import java.util.Scanner;

public class Ch05Ex01_14 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int num[][] = new int[2][4];
		int num2[][] = new int[2][4];
		int num3[][] = new int[2][4];
		
		System.out.println("first array");
		for(int i=0; i<2; i++) {
			for(int j=0; j<4; j++) {
				num[i][j] = scanner.nextInt();
			}
		}
		
		System.out.println("second array");
		for(int a=0; a<2; a++) {
			for(int b=0; b<4; b++) {
				num2[a][b] = scanner.nextInt();
			}
		}
		
		for(int i=0; i<2; i++) {
			for(int j=0; j<4; j++) {
				num3[i][j] = num[i][j]*num2[i][j];
				System.out.printf("%d ", num3[i][j]);
			}
			System.out.println();
		}
	}
}