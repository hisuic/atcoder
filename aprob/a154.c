#include <stdio.h>
#include <string.h>

int main(void) {
  char S[11], T[11], U[11];
  int A ,B;
  scanf("%s %s", S, T);
  scanf("%d %d", &A, &B);
  scanf("%s", U);

  int An = A, Bn = B;

  if (strcmp(S, U) == 0) {
    An--;
    // printf("%d %d", An, Bn);
  } else if (strcmp(T, U) == 0) {
    Bn--;
    // printf("%d %d", An, Bn);
  }

    printf("%d %d", An, Bn);
}
