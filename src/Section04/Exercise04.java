package Section04;

import java.util.Scanner;

public class Exercise04 {

    public static void main(String[] args) {
        
        //Exercise04 - Leia um número rela e imprima o resultado do quadrado desse número.

        Scanner userInput = new Scanner(System.in);
        double inputNumberFromUser;
        double squareOfUserInputNumber;

        //User Input Data
        System.out.println("\nEscreva um número real qualquer usando vírgula (,) para separar casas decimais: ");
        inputNumberFromUser = userInput.nextDouble();

        //Data Processing
        squareOfUserInputNumber = inputNumberFromUser * inputNumberFromUser; // using simple multiplication

        //Program Output
        System.out.println("\nO quadrado do número digitado é: " + squareOfUserInputNumber);
        System.out.println("\nO quadrado do número digitado é: " + Math.pow(inputNumberFromUser, 2)); // using Java Math method

        userInput.close();

    }

}
