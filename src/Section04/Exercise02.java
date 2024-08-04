package Section04;

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        //Exercise02 - Faça um programa que leia um número real e o imprima.

        Scanner userInput = new Scanner(System.in);
        double inputNumberFromUser;

        //User Input Data
        System.out.println("\nEscreva um número real qualquer usando vírgula (,) para separar casas decimais: ");
        inputNumberFromUser = userInput.nextDouble();

        //Program Output Information
        System.out.println("\nO número que voce digitou é: " + inputNumberFromUser);
        System.out.println();

        userInput.close();
    }
    
}