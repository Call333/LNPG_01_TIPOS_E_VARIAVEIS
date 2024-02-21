#include <stdio.h>

int main(void) {
  int numero;

  printf("Digite um número para verificar se ele impar ou par: \n");
  scanf("%d", &numero);

  if(numero % 2 == 0) {
    printf("O número %d é par", numero);
  } else {
    printf("O número %d é impar", numero);
  }
  
  return 0;
}