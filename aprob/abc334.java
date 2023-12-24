// https://atcoder.jp/contests/abc334/tasks/abc334_a

import java.util.Scanner;

class abc334 {
    public static void main(String args[]) {
        Scanner getval = new Scanner(System.in);
        int B = getval.nextInt();
        int G = getval.nextInt();
        if (B > G) {
            System.out.println("Bat");
        } else {
            System.out.println("Glove");
        }
    }
}