//2UP3DOWN
//https://atcoder.jp/contests/abc326/tasks/abc326_a

import java.util.Scanner;

public class abc326 {
    public static void main(String args[]) {
        Scanner getval = new Scanner(System.in);
        int X = getval.nextInt();
        int Y = getval.nextInt();
        getval.close();

        int difference = Y - X;

        if (difference > 0) {
            if (2 >= difference) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } else {
            if (difference >= -3) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}