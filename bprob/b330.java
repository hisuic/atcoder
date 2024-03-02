// abc330
// https://atcoder.jp/contests/abc330/tasks/abc330_b

import java.util.Scanner;
import java.util.Arrays;

class abc330 {
    public static void main(String args[]) {
        Scanner getval = new Scanner(System.in);
        int N = getval.nextInt();
        int L = getval.nextInt();
        int R = getval.nextInt();

        int[] A = new int [N];

		for( int i = 0; i < N; i++) {
			A[i] = getval.nextInt();
		}
        getval.close();

        int[] numbers = new int [R - L + 1];
        int [][] B = new int [N][2];
        int output = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < R - L + 1; j++) {
                numbers[j] = Math.abs((L + j) - A[i]);
                B[j][0] = numbers[j];
                B[j][1] = j + L;
            }
            Arrays.sort(numbers);
            for (int k = 0; k < N; k++) {
                if (B[k][1] == numbers[0]) {
                    output = k;
                }
            }
            System.out.println(output);
        }
    }
}