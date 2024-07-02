#include <stdio.h>

int main(void) {
  int A;
  int B;
  int ML, MS;
  scanf("%d %d", &A, &B);

  int num1 = A;
  int num2 = B;
  while (num2 != 0) {
    int tmp = num2;
    num2 = num2 % num1;
    num1 = tmp;
  }

  MS = A * B / num1;

  printf("%d", MS);
}
