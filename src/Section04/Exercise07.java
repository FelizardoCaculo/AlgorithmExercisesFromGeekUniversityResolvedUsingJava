package Section04;

import java.util.Scanner;

public class Exercise07 {

    public static void main(String[] args) {
        
        /*
         * Exercise07 - Leia uma temperatura em graus Fahrenheit e apresente-a convertida em graus Celsius.
         * A fórmula de conversão é: C = 5.0 * (F - 32.0) / 9.0 sendo C a temperatura em Celsius
         * e F a temperatura em Fahrenheit.
         */

        Scanner userInput = new Scanner(System.in);
        double temperatureInFahrenheit;
        double temperatureInCelsius;

        //User Input Data
        System.out.println("\nDigite a temperatura em graus Fahrenheit, usando vírgula (,) para separar casas decimais: ");
        temperatureInFahrenheit = userInput.nextDouble();

        //Data Processing
        temperatureInCelsius = 5.0 * (temperatureInFahrenheit - 32.0) / 9.0;

        //Program Output
        System.out.println("\nA temperatura digitada em Fahrenheit é equivalente a " + temperatureInCelsius + " graus Celsius\n");

        userInput.close();

    }

}
