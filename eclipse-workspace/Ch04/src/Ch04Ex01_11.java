import java.util.Scanner;

public class Ch04Ex01_11 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		String b = scanner.next();
		
		if(a>0) {
			b = "plus";
		} else if(a<0) {
			b = "minus";
		} else {
			b = "zero";
		}
		System.out.println(b);
		
	}
}