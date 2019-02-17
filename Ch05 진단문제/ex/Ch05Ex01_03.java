package ex;

import java.util.Scanner;

public class Ch05Ex01_03 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		char a[] = new char[10];
		String b = scanner.nextLine();
		
		for(int i=0; i<a.length; i++) {
			a[i] = b.charAt(i);
		}
		
		for(int j=0; j<a.length; j++) {
			if(j==0 || j==3 || j==6) {
				System.out.printf("%c", a[j]);
				
			}
		}
	}
}