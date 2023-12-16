// First ABC 2
// https://atcoder.jp/contests/abc322/tasks/abc322_a

import java.util.Scanner;

class firstabc2 {
    public static void main(String args[]) {
        Scanner getval = new Scanner(System.in);
        int N = getval.nextInt();
        String S = getval.nextLine();
        getval.close();

        char[] Schar = S.toCharArray();

        int judge = 0;
        int n = 0;
        //int i = 0;

        for (int i = 0; i < N - 2; i++) {
        //for (char c : Schar)
            if (Schar[i] == 'A') {
                if (Schar[i + 1] == 'B') {
                    if (Schar[i + 2] == 'C') {
                        //System.out.println(i);
                        n = i;
                        judge++;
                        break;
                    }
                }
            }
            i++;
        }
        if (judge != 0) {
            System.out.println(-1);
        } else {
            System.out.println(n);
        }
    }
}