import java.util.Scanner;

public class portion {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		int H = scanner.nextInt();
		int X = scanner.nextInt();

		int p[] = new int[N];

		for (int i = 0; i < N; i++) {
			p[i] = scanner.nextInt();
		}

		for (int k = 0; k < N; k++) {
			//System.out.println(numbers[k]);
			if ( p[k] + H >= X) {
				System.out.println(k + 1);
				break;
			}
		}
	}
}
