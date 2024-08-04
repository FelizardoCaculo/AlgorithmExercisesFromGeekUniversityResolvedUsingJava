package Section04;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        //Exercise01 - Faça um lagoritmo que leia um número inteiro e o imprima.

        Scanner userInput = new Scanner(System.in);
        int inputNumberFromUser;

        //User input data
        System.out.println("\nEscreva um número inteiro qualquer: ");
        inputNumberFromUser = userInput.nextInt();

        //Programm output information
        System.out.println("\nO número que você digitou é: " + inputNumberFromUser);
        System.out.println();
        
        userInput.close();
    }
}