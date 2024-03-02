// abc333
// https://atcoder.jp/contests/abc333/tasks/abc333_a

import java.util.Scanner;

class abc333 {
    public static void main(String args[]) {
        Scanner getval = new Scanner(System.in);
        int N = getval.nextInt();
        getval.close();
        String Nstring = String.valueOf(N);
        String Nn = "";
        for (int i = 0; i < N; i++) {
            Nn += Nstring;
        }
        System.out.println(Nn);
    }
}