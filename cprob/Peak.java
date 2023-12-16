//Peak
//https://atcoder.jp/contests/abc326/tasks/abc326_c
//TLE - 二分探索を用いる必要あり

import java.util.Scanner;
import java.util.Arrays;

public class Peak {    
    public static void main(String args[]) {
        Scanner getval = new Scanner(System.in);
        int N = getval.nextInt();
        int M = getval.nextInt();
        int[] A = new int [N];
		for( int i = 0; i < N; i++) {
			A[i] = getval.nextInt();
		}
        getval.close();

        int RangeMin = 0; //Minumum number of the range of getting area
        int RangeMax = 0; //Max number of the range of getting area
        int MaxNumberOfPresents = 0;
        int counter;

        Arrays.sort(A);
    
        for (int i = 0; i < N; i++) {
            RangeMin = A[i];
            RangeMax = A[i] + M;
            counter = 0;
            
            for (int j = i; j < N; j++) {
                if (RangeMin <= A[j] && A[j] < RangeMax) {
                    counter++;
                }
            }

            if ( counter >= MaxNumberOfPresents ) {
                MaxNumberOfPresents = counter;
            }
        }
        System.out.println(MaxNumberOfPresents);
    }    
}