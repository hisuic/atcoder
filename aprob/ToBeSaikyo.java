// To Be Saikyo
// https://atcoder.jp/contests/abc313/tasks/abc313_a

import java.util.Scanner;
import java.util.Arrays;

public class ToBeSaikyo {
    public static void main(String args[]) {
        Scanner getval = new Scanner(System.in);
        int N = getval.nextInt();
        int[] P = new int[N];
        int P1;

        for (int i = 0; i < N; i++) {
            P[i] = getval.nextInt();
        }
        getval.close();

        P1 = P[0];
        Arrays.sort(P);

        if (P1 == P[N - 1]) {
            if (P.length == 1) {
                System.out.println(0);
            } else if (P1 == P[N - 2]) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        } else {
            System.out.println(P[N - 1] - P1 + 1);
        }
    }
}