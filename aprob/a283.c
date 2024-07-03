#include <stdio.h>
#include <math.h>

int main(void) {
  double A, B;
  scanf("%lf %lf", &A, &B);
  int result = pow(A, B);
  printf("%d", result);
}
