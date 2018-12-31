package ex;

import java.util.*;

public class Ch02Ex02_08 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		String c = scanner.nextLine();
		
		// System.out.println(c.charAt(0)); >> java에서는 char형을 바로 입력받지 못해서 
					// String형에서 입력받을것을 이용하여 charAt()을 써줘서 char형으로 변환하는 과정
		System.out.printf("%.2f\n%.2f\n%s",a,b,c);
		
	}
}