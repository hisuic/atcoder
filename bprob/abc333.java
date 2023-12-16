// abc333
// https://atcoder.jp/contests/abc333/tasks/abc333_b

import java.util.Scanner;

class abc333 {
    public static void main(String args[]) {
        Scanner getval = new Scanner(System.in);
        String strVertex1 = getval.nextLine();
        String strVertex2 = getval.nextLine();
        char[] charVertex1 = strVertex1.toCharArray();
        char[] charVertex2 = strVertex2.toCharArray();
        int[] vertexs1 = new int[2];
        int[] vertexs2 = new int[2];

        for (int i = 0; i < 2; i++) {
            vertexs1[i] = Integer.valueOf(charVertex1[i]);
        }
        for (int i = 0; i < 2; i++) {
            vertexs2[i] = Integer.valueOf(charVertex2[i]);
        }

        if (Math.abs(vertexs1[0] - vertexs1[1]) == Math.abs(vertexs2[0] - vertexs2[1])) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}