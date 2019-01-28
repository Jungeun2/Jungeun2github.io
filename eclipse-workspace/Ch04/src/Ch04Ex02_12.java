import java.util.Scanner;

public class Ch04Ex02_12 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

			int a = 0, b = 0;
			a = scanner.nextInt();
			b = scanner.nextInt();
			
			if(a>b) {
			 for(int i = a;i>=b;--i) {
				for(int j = 1; j<9;j++) {
				System.out.printf("%d * %d = %2d ",i,j,i*j);
				if(j%3==0) {
				System.out.println();
				}
			}
				System.out.println();
		}
	}
			else {
				for(int i = a;i<=b;++i) {
					for(int j = 1; j<10;++j) {
						System.out.printf("%d * %d = %2d",i,j,i*j);
						if(j%3 == 0)
						{
							System.out.println();
					}
				}
					System.out.println();
			}
		}
	}
}