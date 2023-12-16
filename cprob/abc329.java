// abc329
// https://atcoder.jp/contests/abc329/tasks/abc329_c

import java.util.Scanner;

public class abc329 {
    public static void main(String args[]) {
        Scanner getval = new Scanner(System.in);
        int N = getval.nextInt();
        String S = getval.next();
        char Sarrays[] = S.toCharArray();
        getval.close();

        int counter = 0;
        // int NumberOfConstants = 0;
        if (N != 1) {
            for (int i = 1; i < N; i++) {
                if (Sarrays[i - 1] == Sarrays[i]) {
                    counter++;
                    // if (i > 1 && Sarrays[i - 2] == Sarrays[i]) {
                    //     NumberOfConstants++;
                    // }
                }
                // System.out.println(NumberOfConstants);
            }
        }

        int KineticCounter = 0;
        if (N != 1) {
            for (int i = 0; i < N - 2; i++) {
                if (i < N - 1 && Sarrays[i] == Sarrays[i + 2]) {
                    while (i < N - 1 && Sarrays[i] == Sarrays[i + 1]) {
                        i++;
                    }
                    KineticCounter++;
                    // System.out.println(KineticCounter);
                }
            }
        }

        if (N == 1) {
            System.out.println(1);
        } else {
            // System.out.println(counter + NumberOfConstants);
            System.out.println(counter + KineticCounter);
        }
    }
}