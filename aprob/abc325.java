// Takahashi san
// https://atcoder.jp/contests/abc325/tasks/abc325_a

import java.util.Scanner;

public class abc325 {
    public static void main(String[] args) {
        Scanner getline = new Scanner(System.in);
        String input = getline.nextLine(); 
        getline.close();
        String[] words = input.split(" "); // 文字列を空白で分割

        System.out.println(words[0] + " san");
    }
}