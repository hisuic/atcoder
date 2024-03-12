import java.util.Scanner;

class a344 {
    public static void main(String[] args) {
        Scanner getval = new Scanner(System.in);
        String S = getval.nextLine();
        String[] S_separated = S.split("\\|");
        char[] S_chared = S.toCharArray();

        if (S_chared[0] == '|' && S_chared[S.length() - 1] != '|') {
            System.out.println(S_separated[1]);
        } else if (S_chared[0] != 0 && S_chared[S.length() - 1] == '|') {
            System.out.println(S_separated[0]);
        } else if ( S_chared[0] != '|' && S_chared[S.length() - 1] != '|') {
            System.out.println(S_separated[0] + S_separated[2]);
        }

        // for (int i = 0; i < S_separated.length - 1; i++) {
        //     System.out.println(S_separated[i]);
        // }
    }
}