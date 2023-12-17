import java.util.Scanner;

public class abc324 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();
        scanner.close();

        // Nが2または3の冪乗で割り切れるかどうかを確認
        while (N % 2 == 0) {
            N /= 2;
        }
        while (N % 3 == 0) {
            N /= 3;
        }

        // Nが1になれば、2^x * 3^y の形で表現可能
        if (N == 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

/*import java.lang.Math;

public class threesmoothnumbers {
    public static void main(String args[]) {
        Scanner getval = new Scanner(System.in);
        int N = getval.nextInt();
        getval.close();

        int x = 0, y = 0, sum = 0;
        int judge = 0; // Number if the x and y exist or not

        while (true) {
            while (sum < Math.pow(10, 18)) {
                sum = (int)Math.pow(2, x) * (int)Math.pow(3, y);
                if (sum == N) {
                    System.out.println("Yes");
                    judge ++;
                    break;
                }
                x++;
            }
            if (judge != 0) {
                break;
            }
            y++;
        }
        if (judge == 0) {
            System.out.println("No");
        }
    }
}*/