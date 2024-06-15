import java.util.Scanner;

public class a358 {
  public static void main(String args[]) {
    Scanner getval = new Scanner(System.in);
    String S = getval.next();
    String T = getval.next();
    // System.out.println(S);
    // System.out.println(T);
    if (S.equals("AtCoder") == true && T.equals("Land") == true) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
