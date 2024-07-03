// https://atcoder.jp/contests/abc132/tasks/abc132_a

#include <stdio.h>

int main(void) {
  char S[4];
  scanf("%s", S);
  int sum = 0;
  for (int i = 0; i < 4; i++) {
    sum += S[i];
  }
  // printf("%d\n", sum);
  int counter_char = (sum - S[1] * 2) / 2;
  int judger = sum - (S[1] * 2);
  // printf("%d\n", counter_char);
  // printf("%d\n", judger);
  if (S[0] * 4 == sum) {
    printf("No");
    return 0;
  }
  for (int j = 0; j < 4; j++) {
    if (S[j] == counter_char) {
      if ((judger - S[j]) == counter_char) {
        printf("Yes");
        return 0;
      } else {
        printf("No");
        return 0;
      }
    } else {
      if (S[0] == S[j]) {
        continue;
      }
      printf("No");
      return 0;
    }
  }
}
