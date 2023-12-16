//Water Station
//https://atcoder.jp/contests/abc305/tasks/abc305_a

import java.util.Scanner;

public class WaterStation {
    public static void main(String args[]) {
        Scanner getval = new Scanner(System.in);
        int N = getval.nextInt();
        getval.close();

        for (int i = 0; i < 5; i++) {
            if ((N + i) % 5 == 0) {
                System.out.println(N + i);
            }
        }
    }
}