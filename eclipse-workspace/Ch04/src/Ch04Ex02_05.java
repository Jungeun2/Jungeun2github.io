import java.util.Scanner;

public class Ch04Ex02_05 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int a = 0;
			while(1==1) {
			a = scanner.nextInt();
			if(a%3 ==0) {
				System.out.println(a/3);
			}
			else if(a%3 ==-1) {
			break;
				
			}
		}
	}
}