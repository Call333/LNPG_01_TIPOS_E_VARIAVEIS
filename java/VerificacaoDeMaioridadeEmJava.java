package java;
import java.util.Scanner;

public class VerificacaoDeMaioridadeEmJava {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int idade;

        System.out.println("Digite a sua idade: ");
        idade = entrada.nextInt();

        if(idade >= 18) {
            System.out.println("Você é MAIOR de idade no Brasil!");
        } else {
            System.out.println("Você é MENOR de idade no Brasil!");
        }

        entrada.close();
    }
}
