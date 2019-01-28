import java.util.Scanner;

public class Ch04Ex02_15 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int a,b,c,d = 0;
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		d = scanner.nextInt();
		
		System.out.printf("%d\n",a);
		
		for (b=a;b>=1;b--) {
			for (d=b;d<a+1;d++) {
				System.out.print("*");
			} System.out.print("\n");
		}
		for (b=1;b<a;b++) {
			for (d=b;d<a;d++) {
				System.out.print("*");
			} System.out.print("\n");
			
		}
	}
}