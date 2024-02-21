package java;
import java.util.Scanner;

class ConversaoDeTemperaturaEmJava {
    public static void main(String[] args) {
        double temperaturaEmCelsius, temperaturaEmFahrenheit;

        System.out.println("Digite a Temperatura em Celsius: ");
        Scanner entrada = new Scanner(System.in);

        temperaturaEmCelsius = entrada.nextDouble();
        
        temperaturaEmFahrenheit = (temperaturaEmCelsius * 1.8) + 32;

        System.out.println("A temperatura em C° na escala F° equivale a " + temperaturaEmFahrenheit);

        entrada.close();
    }
}