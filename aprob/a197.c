#include <stdio.h>

int main(void) {
  char S[100];
  scanf("%s", S);
  char S_first = S[0];
  for (int i = 0; i < 2; i++) { // loop two times
    S[i] = S[i + 1];
  }
  S[2] = S_first;
  printf("%s", S);
}
