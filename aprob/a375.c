#include <stdio.h>

#define N_MAX 200000

int main(void) {
  int N;
  char S[N_MAX];
  scanf("%d", &N);
  scanf("%s", S);

  if (N < 3) {
    printf("0");
    return 0;
  }

  int countSeats = 0;

  for (int i = 0; i < N - 2; i++) {
    if (S[i] == '#') {
      if (S[i + 1] == '.') {
        if (S[i + 2] == '#') {
          countSeats++;
        }
      }
    }
  }
  printf("%d", countSeats);
  return 0;
}
