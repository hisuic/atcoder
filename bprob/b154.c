#include <stdio.h>
#include <string.h>

int main(void) {
  char S[101];
  scanf("%s", S);
  int str_length = strlen(S);
  for (int i = 0; i < str_length; i++) {
    printf("x");
  }
}
