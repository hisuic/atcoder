#include <stdio.h>

int main(void) {
  int N;
  scanf("%d", &N);

  char T[N];
  scanf("%s", T);
  char A[N];
  scanf("%s", A);

  for (int i = 0; i < N; i++) {
    if (T[i] == 'o' && A[i] == 'o') {
      printf("Yes\n");
      return 0;
    }
  }
  printf("No\n");
  return 0;
}
