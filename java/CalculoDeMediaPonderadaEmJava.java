package java;
import java.util.Scanner;

public class CalculoDeMediaPonderadaEmJava {
    public static void main(String[] args) {
        // SCANNER
        Scanner entrada = new Scanner(System.in);

        //VARIAVEIS
        double nota1, nota2, nota3;
        double peso1, peso2, peso3;
        double mediaPonderada;

        //NOTAS
        System.out.println("Digite a primeira nota: ");
        nota1 = entrada.nextDouble();
        System.out.println("Digite a segunda nota: ");
        nota2 = entrada.nextDouble();
        System.out.println("Digite a terceira nota: ");
        nota3 = entrada.nextDouble();

        //PESOS
        System.out.println("Digite o primeiro peso: ");
        peso1 = entrada.nextDouble();
        System.out.println("Digite o segundo peso: ");
        peso2 = entrada.nextDouble();
        System.out.println("Digite o terceiro peso: ");
        peso3 = entrada.nextDouble();

        //FORMULA
        mediaPonderada = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3);
        
        //FINAL
        System.out.println("A media ponderada resultante é " + mediaPonderada);

        entrada.close();
    }
}
