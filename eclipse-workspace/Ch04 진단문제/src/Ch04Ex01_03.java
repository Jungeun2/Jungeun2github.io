import java.util.Scanner;

public class Ch04Ex01_03 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		if(a>=20) {
			
			System.out.println("adult");
			
		} else {
			
			System.out.println(20-a+" years later");
			
		}
	}
}