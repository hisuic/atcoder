// abc332
// https://atcoder.jp/contests/abc332/tasks/abc332_a

import java.util.Scanner;

class abc332 {
    public static void main(String args[]) {
        Scanner getval = new Scanner(System.in);
        int N = getval.nextInt();
        int S = getval.nextInt();
        int K = getval.nextInt();
        int totalPrice = 0;

        int price[][] = new int[N][2];

        // N個の整数を受け取り配列に格納
		for( int i = 0; i < N; i++) {
			price[i][0] = getval.nextInt();
            price[i][1] = getval.nextInt();
		}

        for(int i = 0; i < N; i++ ) {
            totalPrice += price[i][0] * price[i][1];
        }
        if (totalPrice < S) {
            totalPrice += K;
        }

        System.out.println(totalPrice);
    }
}