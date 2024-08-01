// https://atcoder.jp/contests/abc256/tasks/abc256_a

#include <stdio.h>

int main(void) {
  int S;
  scanf("%d", &S);
  int output = 2 << (S - 1);
  if (S == 0) {
    printf("1\n");
  } else {
    printf("%d\n", output);
  }
}
