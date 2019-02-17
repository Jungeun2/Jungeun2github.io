import java.util.Scanner;

public class Ch04Ex02_16 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		String b =  scanner.next();
		
		a = Integer.parseInt(b);
		
		for(int i=1;i<a;i++) {
		for(int j=0;j<=a;j++) {
			System.out.print("");
			}
		}
	}
}