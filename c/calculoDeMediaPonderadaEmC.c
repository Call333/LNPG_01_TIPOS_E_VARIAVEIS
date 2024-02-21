#include <stdio.h>

int main(void) {
  float nota1, nota2, nota3, peso1, peso2, peso3;
  
  // Digitação das notas
  printf("-- ** DIGITE AS NOTAS A SEGUIR ** --\n");
  printf("Digite uma primeira nota: \n");
  scanf("%f", &nota1);
  printf("Digite uma segunda nota: \n");
  scanf("%f", &nota2);
  printf("Digite uma terceira nota: \n");
  scanf("%f", &nota3);
  
  // Digitação dos PESOS
  printf("-- ** DIGITE OS PESOS A SEGUIR ** --\n");
  printf("Digite um primeiro peso: \n");
  scanf("%f", &peso1);
  printf("Digite um segundo peso: \n");
  scanf("%f", &peso2);
  printf("Digite um terceiro peso: \n");
  scanf("%f", &peso3);
  // Calculo da media ponderada
  float mediaPonderada = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3);
  
  printf("A média ponderada é: %f", mediaPonderada);
  
  return 0;
}