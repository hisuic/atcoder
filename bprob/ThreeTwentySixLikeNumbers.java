//326-like Numbers
//https://atcoder.jp/contests/abc326/tasks/abc326_b

import java.util.Scanner;

public class ThreeTwentySixLikeNumbers {
    public static void main(String args[]) {
        Scanner getval = new Scanner(System.in);
        int N = getval.nextInt();
        getval.close();
        int hundred = 0, ten = 0, one = 0;

        while (true) {
            hundred = N / 100; //System.out.println(hundred);
            ten = (N - (hundred * 100)) / 10; //System.out.println(ten);
            one = N - (hundred * 100) - (ten * 10); //System.out.println(one);

            if ( hundred * ten == one ) {
                System.out.println(N);
                break;
            } else {
                N++;
            }
        }
    }
}