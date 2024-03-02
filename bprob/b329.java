// abc329
// https://atcoder.jp/contests/abc329/tasks/abc329_b

import java.util.Arrays;
import java.util.Scanner;

public class abc329 {
    public static void main(String args[]) {
        Scanner getval = new Scanner(System.in);
        // N個の整数を受け取り配列に格納
        int N = getval.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = getval.nextInt();
        }
        getval.close();

        // 配列Aのソート
        Arrays.sort(A);
        int max = A[A.length - 1]; // 最大の整数

        int secondMax = binarySearchForSecondMax(A, max);

        System.out.println(secondMax);
    }

    private static int binarySearchForSecondMax(int[] arr, int max) {
            int left = 0;
            int right = arr.length - 1;
            int secondMax = -1;
    
            while (left <= right) {
                int mid = left + (right - left) / 2;
    
                if (arr[mid] < max) {
                    secondMax = arr[mid];
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
    
            return secondMax;
        }
}