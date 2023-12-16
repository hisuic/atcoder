//ABC327
//ab
//https://atcoder.jp/contests/abc327/tasks/abc327_a

import java.util.Scanner;
import java.util.Arrays;

public class ab {
    public static void main(String args[]) {
        Scanner getval = new Scanner(System.in);
        int N = getval.nextInt();
        String S;
        int judge = 0;
    
        S = getval.next();
        getval.close();

        char[] Sarray = S.toCharArray();

        for(int i = 0; i < N - 1; i++) {
            if (Sarray[i] == 'a') {
                if (Sarray[i + 1] == 'b') {
                    System.out.println("Yes");
                    judge++;
                    break;
                }
            }
            else if (Sarray[i] == 'b') {
                if (Sarray[i + 1] == 'a') {
                    System.out.println("Yes");
                    judge++;
                    break;
                }
            }
        }
        if (judge == 0) {
            System.out.println("No");
        }
    }
}