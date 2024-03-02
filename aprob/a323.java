// Weak Beats
// https://atcoder.jp/contests/abc323/tasks/abc323_a

import java.util.Scanner;

class abc323 {
    public static void main(String args[]) {
        Scanner getval = new Scanner(System.in);
        String S = getval.nextLine();
        getval.close();

        char[] Sstring = S.toCharArray();

        int counter = 0;
        for (int i = 0; i < 8; i++) {
            //if (Character.getNumericValue(Sstring[(i * 2) + 1]) == 0) {
            if (Sstring[(i * 2) + 1] == '0') {
                //System.out.println(Sstring[(i * 2) + 2]);
                counter++;
            }
        }

        //System.out.println(counter);

        if (counter == 8) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}