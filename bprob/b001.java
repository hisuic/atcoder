import java.util.*;

public class b001 {
    public static void main(String[] args) {
        Scanner getval = new Scanner(System.in);
        float m = getval.nextFloat();

        if (m < 100) {
            System.out.println("00");
        } else if (100 <= m && m <= 5000) {
            // System.out.println((m / 100) * 10);
            if (((m / 1000) * 10) < 10) {
                System.out.println("0" + String.valueOf((int) ((m / 1000) * 10)));
            } else {
                System.out.println((int) ((m / 1000) * 10));
            }
        } else if (6000 <= m && m <= 30000) {
            System.out.println((int) (m / 1000 + 50));
        } else if (35000 <= m && m <= 70000) {
            System.out.println((int) (((m / 1000) - 30) / 5 + 80));
        } else if (70000 < m) {
            System.out.println(89);
        }
    }
}
