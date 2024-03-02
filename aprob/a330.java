// abc330 a
// https://atcoder.jp/contests/abc330/tasks/abc330_a

import java.util.Scanner;
import java.util.Arrays;

class abc330 {
    public static void main(String args[]) {
        Scanner getval = new Scanner(System.in);
        int N = getval.nextInt();
        int L = getval.nextInt();
        int[] A = new int [N];

		for( int i = 0; i < N; i++) {
			A[i] = getval.nextInt();
		}
        getval.close();

		Arrays.sort(A);
        
        int counter = 0;
        int failureCounter = 0;
        while (A[counter] < L) {
            if (counter == N - 1) {
                failureCounter++;
                break;
            }
            failureCounter++;
            counter++;
        }
        System.out.println(N - failureCounter);
    }
}