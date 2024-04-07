import java.util.*;

class a348 {
    public static void main(String[] args) {
        Scanner getval = new Scanner(System.in);
        int N = getval.nextInt();
        for( int i = 0; i < N; i++ ) {
            if ((i + 1) % 3 == 0) {
                System.out.print("x");
            } else {
                System.out.print("o");
            }
        }
    }
}