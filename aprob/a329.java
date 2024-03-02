// abc329
// https://atcoder.jp/contests/abc329/tasks/abc329_a

import java.util.Scanner;

public class abc329 {
    public static void main(String args[]) {
        Scanner getval = new Scanner(System.in);
        String S = getval.nextLine();
        getval.close();
        char Sarray[] = S.toCharArray();
        int ArrayLength = Sarray.length;
        for (int i = 0; i < ArrayLength; i++) {
            System.out.print(Sarray[i]);
            if (i != ArrayLength - 1) {
                System.out.print(' ');
            }
        }
    }
}