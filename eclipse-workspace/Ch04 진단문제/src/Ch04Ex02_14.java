import java.util.Scanner;

public class Ch04Ex02_14 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int a = 0, b = 0;
		
		a = scanner.nextInt();
		b = scanner.nextInt();
		
		if(a<=0 || b<=0 || a==b) { }
		
		for(int i = 1;i<10;i++) {
			if(a>b) { 
				for(int j = a;j>=b;j--) {
				System.out.print(j+" * "+i+" = "+(i*j)+" ");
				}
			} else if(b>a) {
				for(int j = b;j>=a;j--) {
				System.out.print(j+" * "+i+" = "+(i*j)+" ");
				}
			}
		}		
	}
}