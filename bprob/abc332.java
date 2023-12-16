// abc332
// https://atcoder.jp/contests/abc332/tasks/abc332_b

import java.util.Scanner;

class abc332 {
    public static void main(String args[]) {
        Scanner getval = new Scanner(System.in);
        int K = getval.nextInt();
        int G = getval.nextInt(); int amountG = 0;
        int M = getval.nextInt(); int amountM = 0;
        int amountGap;

        for (int i = 0; i < K; i++ ) {
            if (G == amountG) {
                amountG = 0;
            } else if (amountM == 0) {
                amountM = M;
            } else {
                while(true) {
                    if (G - amountG - amountM <= 0) {
                        amountGap = G - amountG;
                        amountG = G;
                        amountM -= amountGap;
                        amountM = 0;
                    } else {
                        amountG += amountM;
                        amountM = 0;
                    }
                    if (amountG >= 0 || amountM >= 0) {
                        break;
                    }
                    // System.out.println(amountG + " " + amountM);
                }
            }
        }

        System.out.println(amountG + " " + amountM);
    }
}