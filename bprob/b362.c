// https://atcoder.jp/contests/abc362/tasks/abc362_b

#include <stdio.h>
#include <string.h>

int naiseki(int a, int c, int b, int d) {
    int output = a * b + c * d;
    return output;
}

int main(void) {
    int xA, yA, xB, yB, xC, yC;
    scanf("%d", &xA);
    scanf("%d", &yA);
    scanf("%d", &xB);
    scanf("%d", &yB);
    scanf("%d", &xC);
    scanf("%d", &yC);
    
    int ABx = xB - xA;
    int ABy = yB - yA;
    int ACx = xC - xA;
    int ACy = yC - yA;
    int BCx = xC - xB;
    int BCy = yC - yB;

    if (naiseki(ABx, ABy, ACx, ACy) == 0 || naiseki(ABx, ABy, BCx, BCy) == 0 || naiseki(ACx, ACy, BCx, BCy) == 0) {
      printf("Yes\n");
    } else {
      printf("No\n");
    }
    return 0;
}

