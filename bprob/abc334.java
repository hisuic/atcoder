// https://atcoder.jp/contests/abc334/tasks/abc334_b

import java.util.Scanner;

class abc334 {
    public static void main(String args[]) {
        Scanner getval = new Scanner(System.in);
        int A = getval.nextInt();
        int M = getval.nextInt();
        int L = getval.nextInt();
        int R = getval.nextInt();
        int upperCurrentPlace = A + M, lowerCurrentPlace = A - M;
        int upCount = 0, lowCount = 0;
        int additionalCount = 0;

        if (A > L && A < R) {
            while (lowerCurrentPlace >= L) {
                lowCount++;
                lowerCurrentPlace -= M;
            }

            while (upperCurrentPlace <= R) {
                upCount++;
                upperCurrentPlace += M;
            }

            additionalCount++;
        }

        System.out.println(upCount + lowCount + additionalCount);
    }
}