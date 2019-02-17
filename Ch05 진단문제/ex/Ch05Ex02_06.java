package ex;

import java.util.Scanner;

public class Ch05Ex02_06 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		char a[] = {'A', 'P', 'P', 'L', 'E', '!'};
		char b = scanner.next().charAt(0);
		int c = 0;
		
		for(int i=0; i<6; i++) {
			if(b==a[i]) {
				System.out.println(i);
				c = -1;
			}
		}
			if(c != -1) {
				System.out.println("none");
		}
	}
}