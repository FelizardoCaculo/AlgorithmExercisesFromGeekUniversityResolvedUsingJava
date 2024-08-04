package Section04;

import java.util.Scanner;

public class Exercise06 {

    public static void main(String[] args) {
        
        /*
         * Exercise06 - Leia a temperatura em graus Celsius e apresente-a convertida em graus Fahrenheit.
         * A fórmula de conversão é: F = C * (9.0 / 5.0) + 32.0, sendo F a temperatura em Fahrenheit e 
         * C a temperatura em Celsius.
         */

        Scanner userInput = new Scanner(System.in);
        double temperatureInCelsius;
        double temperatureInFahrenheit;

        //User Input Data
        System.out.println("\nEscreva o valor em graus Celsius, use vírgula (,) para separar casas decimais: ");
        temperatureInCelsius = userInput.nextDouble();

        //Data Processing
        temperatureInFahrenheit = temperatureInCelsius * (9.0 / 5.0) + 32.0;

        //Program Output Information
        System.out.println("\nA temperatura digitada em graus Celsius é equivalente a " + temperatureInFahrenheit + " graus Fahrenheit\n");

        userInput.close();

    }

}
