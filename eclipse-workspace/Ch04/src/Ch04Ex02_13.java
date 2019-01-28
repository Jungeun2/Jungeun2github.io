import java.util.Scanner;

public class Ch04Ex02_13 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int a = 0, b = 0;
		
		a = scanner.nextInt();
		b = scanner.nextInt();
		
		if(a<=0 || b<=0) { }
		
		for(int i = 1;i<=a;i++) {
		for(int j = 1;j<=a;j++) {
			
			System.out.print(i*j+" ");
	
			}
		
			System.out.println("");
		}
	}
}