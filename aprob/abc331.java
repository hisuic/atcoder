// abc331
// https://atcoder.jp/contests/abc331/tasks/abc331_a

import java.util.Scanner;

class abc331 {
    public static void main(String args[]) {
        Scanner getval = new Scanner(System.in);
        int M = getval.nextInt();
        int D = getval.nextInt();
        int y = getval.nextInt();
        int m = getval.nextInt();
        int d = getval.nextInt();

        if (d == D) {
            if (m == M) {
                System.out.println(y + 1);
                System.out.println(1);
                System.out.println(1);
            } else {
                System.out.println(y);
                System.out.println(m + 1);
                System.out.println(1);
            }
        } else {
            System.out.println(y);
            System.out.println(m);
            System.out.println(d + 1);
        }
    }
}