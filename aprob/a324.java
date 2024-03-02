// Same
// https://atcoder.jp/contests/abc324/tasks/abc324_a

import java.util.Scanner;

class abc324 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        int[] number = new int[n];
        
        for (int i = 0; i < n; i++) {
            number[i] = scanner.nextInt();
        }

        int judge = 0; // Judge if the number is all same or not

        for (int j = 0; j < n -1; j++) {
            if (number[j] != number[j + 1]) {
                judge++;
                break;
            }
        }

        if (judge == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}