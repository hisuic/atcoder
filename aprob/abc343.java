import java.util.*;

class abc343 {
    public static void main(String[] args) {
        Scanner getval = new Scanner(System.in);
        int A = getval.nextInt();
        int B = getval.nextInt();
        if (A + B >= 10) {
            System.out.println(1);
        } else if (A + B == 5) {
            System.out.println(1);
        } else {
            System.out.println(5);
        }
    }
}