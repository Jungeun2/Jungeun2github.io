import java.util.Scanner;

public class Ch04Ex01_06 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String a = scanner.next();
		int age = scanner.nextInt();
		
		if(a.equals("M") && age >= 18) {
		System.out.println("MAN");
		
		} else if(a.equals("F") && age >= 18) {
		System.out.println("WOMAN");
		
		} else if(a.equals("M") && age < 18) {
		System.out.println("BOY"); 
			
		} if(a.equals("F") && age < 18) {
	    System.out.println("GIRL");
	    
		}
	}
}