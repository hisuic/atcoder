// https://atcoder.jp/contests/abc362/tasks/abc362_a

#include <stdio.h>
#include <string.h>

int main(void) {
  int R, G, B, result;
  char C[10];
  scanf("%d", &R);
  scanf("%d", &G);
  scanf("%d", &B);
  scanf("%s", C);
  if (strcmp(C, "Red") == 0) {
    if (G < B) {
        result = G;
    } else {
        result = B;
    }
  } else if (strcmp(C, "Green") == 0) {
    if (R < B) {
        result = R;
    } else {
        result = B;
    }
  } else if (strcmp(C, "Blue") == 0) {
    if (R < G) {
        result = R;
    } else {
        result = G;
    }
  }
  printf("%d\n", result);
}
