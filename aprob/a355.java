import java.util.Scanner;

public class a355 {
  public static void main(String args[]) {
    Scanner getval = new Scanner(System.in);
    int A = getval.nextInt();
    int B = getval.nextInt();
    if (A == B) {
      System.out.println(-1);
    } else if (A + B == 3) {
      System.out.println(3);
    } else if (A + B == 4) {
      System.out.println(2);
    } else if (A + B == 5) {
      System.out.println(1);
    }
  }
}
