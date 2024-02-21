#include <stdio.h>

int main(void) {
  float temperaturaEmCelsius;
  printf("Digite a temperatura em Celsius: \n");
  scanf("%f", &temperaturaEmCelsius);

  float temperaturaFahrenheit = (temperaturaEmCelsius * 1.8) + 32;

  printf("A temperatura em Fahrenheit é: %.2f", temperaturaFahrenheit);
  
  return 0;
}
