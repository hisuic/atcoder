//ABC322 C
//Festival
//https://atcoder.jp/contests/abc322/tasks/abc322_c

import java.util.Scanner;

public class abc322 {
    public static void main(String args[]) {
        Scanner getval = new Scanner(System.in);
        int N = getval.nextInt();
        int M = getval.nextInt();
        int[] A = new int [N];

		for( int i = 0; i < N; i++) {
			A[i] = getval.nextInt();
		}
        getval.close();

        int counter = 0;
        int difference;

        for (int i = 0; i < N; i++) {
            difference = A[counter] - i;
            if (difference >= 0) {
                i += difference;
                
             }
        }
    }
}
