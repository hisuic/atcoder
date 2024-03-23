import java.util.*;

class a346 {
    public static void main(String[] args) {
        Scanner getval = new Scanner(System.in);
        int N = getval.nextInt();

        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = getval.nextInt();
        }

        for (int i = 0; i < N - 1; i++) {
            System.out.print(A[i] * A[i + 1]);
            System.out.print(" ");
        }
    }
}