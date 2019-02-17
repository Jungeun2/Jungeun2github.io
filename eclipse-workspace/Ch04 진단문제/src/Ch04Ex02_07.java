import java.util.Scanner;

public class Ch04Ex02_07 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		int b = 0;
		
		while(b<a) {
			System.out.printf("%d ",++b);
			
		}
	}
}