// https://atcoder.jp/contests/abc332/tasks/abc332_c

import java.util.Scanner;

class abc332 {
    // public static String formatInteger(int num, int i) {
    //     // %dは整数を表すフォーマット指定子
    //     // %0Nd はN桁の整数を表す。足りない場合はゼロで埋める
    //     String format = String.format("%%0%dd", i);
    //     return String.format(format, num);
    // }
    public static void main(String args[]) {
        Scanner getval = new Scanner(System.in);

        int N = getval.nextInt();
        int M = getval.nextInt();
        // int S = getval.nextInt();
        String Sstring = getval.next();
        // String Sstring = formatInteger(S, N);
        int logo = 0; int defaultLogo = 0;
        int defaultM = M;
        int boughtCounter = 0;
        // char[] days = String.valueOf(S).toCharArray();
        // char[] days = Sstring.toCharArray();
        char[] days = Sstring.toCharArray();

        for (int i = 0; i < N; i++) {
            switch (days[i]) {
                case '0':
                    M = defaultM;
                    logo = defaultLogo;
                    break;
                case '1':
                    if (M > 0) {
                        M -= 1;
                    } else if (logo > 0) {
                        logo -= 1;
                    } else {
                        defaultLogo++;
                        boughtCounter++;
                    }
                    break;
                case '2':
                    if (logo > 0) {
                        logo -= 1;
                    } else {
                        defaultLogo++;
                        boughtCounter++;
                    }
                    break;
            }
        }
        System.out.println(boughtCounter);
    }
}