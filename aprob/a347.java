import java.util.Scanner;

class a347 {
	public static void main(String[] args) {
		Scanner getval = new Scanner(System.in);
		int N = getval.nextInt();
		int K = getval.nextInt();

		int[] A = new int[N];

		for (int i = 0; i < N; i++) {
			A[i] = getval.nextInt();
		}

		for (int j = 0; j < N; j++) {
			if (A[j] % K == 0) {
				System.out.print(A[j] / K);
				System.out.print(" ");
			}
		}
	}
}