// https://atcoder.jp/contests/abc267/tasks/abc267_a

#include <stdio.h>
#include <string.h>

int main(void) {
  char S[10];
  scanf("%s", S);
  
  int Saturday = 5;
  
    if (strcmp(S, "Monday") == 0) {
        printf("%d\n", Saturday - 0);
    } else if (strcmp(S, "Tuesday") == 0) {
        printf("%d\n", Saturday - 1);
    } else if (strcmp(S, "Wednesday") == 0) {
        printf("%d\n", Saturday - 2);
    } else if (strcmp(S, "Thursday") == 0) {
        printf("%d\n", Saturday - 3);
    } else if (strcmp(S, "Friday") == 0) {
        printf("%d\n", Saturday - 4);
    } else {
        printf("input valid date\n");
    }
	return 0;
}
