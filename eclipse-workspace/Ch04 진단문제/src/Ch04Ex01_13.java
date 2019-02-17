import java.util.Scanner;

public class Ch04Ex01_13 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("번호를 입력하세요.> ");
		
		String a = scanner.next();
		int b = scanner.nextInt();
		
		
		switch (b) {
		case 1 : a = "dog";
		break;
		case 2 : a = "cat";
		break;
		case 3 : a = "chick";
		break;
		default : a = "I don't know.";
		}
		System.out.println(a);
		
	}
}