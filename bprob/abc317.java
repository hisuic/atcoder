import java.util.Scanner;
import java.util.Arrays;

public class abc317 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] A = new int [N];

		for( int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}

		Arrays.sort(A);

		int counter = A[0];

		for ( int j = 0; j < N; j++) {
			if (counter != A[j]) {
				System.out.println(counter);
				break;
			}
			counter++;
		}
	}
}
