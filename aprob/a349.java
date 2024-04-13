import java.util.*;

public class a349 {
  public static void main(String[] args) {
    Scanner getval = new Scanner(System.in);
    int N = getval.nextInt() - 1;
    int[] A = new int[N];
    int sumarray = 0;
    for (int i = 0; i < N; i++) {
      A[i] = getval.nextInt();
      sumarray += A[i];
    }
    getval.close();

    // System.out.println(sumarray);

    if (sumarray == 0) {
      System.out.println(0);
    } else if (sumarray > 0) {
      System.out.println(sumarray * (-1));
    } else {
      System.out.println(Math.abs(sumarray));
    }
  }
}