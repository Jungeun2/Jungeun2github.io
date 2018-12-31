package ex;

import java.util.*;

public class Ch02Ex02_06 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		double yd = 91.44;
		double in = 2.54;
		
		double input = scanner.nextDouble();
		double input2 = scanner.nextDouble();
		
		System.out.printf("%4.1fyd = %5.1fcm\n", input, yd*input);
		System.out.printf("%4.1fyd = %5.1fcm\n", input2, in*input2);

	}
}