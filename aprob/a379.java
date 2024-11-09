import java.util.*;

public class a379 {
  public static void main(String[] args) {
    Scanner getval = new Scanner(System.in);
    int N = getval.nextInt();
    char[] N_carray = String.valueOf(N).toCharArray();
    char[] N_f = new char[3];
    char[] N_s = new char[3];

    N_f[0] = N_carray[1];
    N_f[1] = N_carray[2];
    N_f[2] = N_carray[0];

    N_s[0] = N_carray[2];
    N_s[1] = N_carray[0];
    N_s[2] = N_carray[1];

    int N_f_int = Integer.parseInt(new String(N_f));
    int N_s_int = Integer.parseInt(new String(N_s));

    System.out.println(N_f_int);
    System.out.println(N_s_int);
  }
}
