#include <math.h>
#include <stdio.h>
#include <stdlib.h>

void print(int left, int right) {
  for (int i = left; i <= right; i++) {
    printf("%d ", i);
  }
}

int main(void) {
  int K, X;
  int left, right;
  scanf("%d %d", &K, &X);
  if (X - K < -1000000) {
    left = -1000000;
    right = X + abs(X - K + 1000000);
    print(left + 1, right - 1);
  } else if (X + K > 1000000) {
    right = 1000000;
    left = X + K - 1000000;
    print(left + 1, right - 1);
  } else {
    left = X - K;
    right = X + K;
    print(left + 1, right - 1);
  }
}
