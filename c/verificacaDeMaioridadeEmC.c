#include <stdio.h>

int main(void) {
  int idade;
  printf("Qual é sua idade? \n");
  scanf("%d", &idade);

  if(idade >= 18) {
    printf("Você é maior de idade no Brasil");
  } else {
    printf("Você NÃO é maior de idade no Brasil");
  }

  
  return 0;
}