// https://atcoder.jp/contests/abc252/tasks/abc252_b

#include <stdio.h>
#include <string.h>

int main(void) {
  int N, K;
  scanf("%d", &N);
  scanf("%d", &K);
  int A[N], B[K];
  int biggest = 0;
  for (int i = 0; i < N; i++) {
    scanf("%d", &A[i]);
    if (biggest < A[i]) {
      biggest = A[i];
    }
  }
  for (int i = 0; i < K; i++) {
    scanf("%d", &B[i]);
  }
  char result[5] = "No";
  for (int i = 0; i < K; i++) {
    if (A[B[i - 1]] == biggest) {
      strcpy(result, "Yes");
    }
  }
  return 0;
}
