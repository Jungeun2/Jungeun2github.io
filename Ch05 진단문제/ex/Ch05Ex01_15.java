package ex;

import java.util.Scanner;

public class Ch05Ex01_15 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int a[][] = new int[5][5];
		int b=0, c=0;
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<4; j++) {
				a[i][j] = scanner.nextInt();
				b = a[i][j] + b;
			}
				if((b/4) >= 80) {
					a[i][4] = 1;
					c++;
					b = 0;
			} else if ((b/4) < 80) {
					a[i][4] = 0;
					b = 0;
			}
		}
			for(int i=0; i<5; i++) {
				if(a[i][4]==0) {
					System.out.println("fail");
					
				} else if(a[i][4]==1) {
					System.out.println("pass");
			}
		}			System.out.printf("Successful : %d", c);
	}
}