package java;
import java.util.Scanner;

class CalculadoraSimplesEmJava {
    public static void main(String[] args) {
        int numero1, numero2, soma, subt, multi;
        double divisao;
    
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número: ");
        numero1 = entrada.nextInt();
        
        System.out.println("Digite um número: ");
        numero2 = entrada.nextInt();

        soma = numero1 + numero2;
        subt = numero1 - numero2;
        multi = numero1 * numero2;
        divisao = numero1 / numero2;

        System.out.println("A SOMA dos número é: " + soma);
        System.out.println("A SUBTRAÇÃO dos números é: " + subt);
        System.out.println("A MULTIPLICAÇÃO dos números é: " + multi);
        System.out.println("A DIVISÃO dos números é: " + divisao);

        entrada.close();
    }
}