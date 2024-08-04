package Section04;

import java.util.Scanner;

public class Exercise05 {

    public static void main(String[] args) {
        
        //Exercise05 - Leia um número real e imprima a quinta parte deste número.

        Scanner userInput = new Scanner(System.in);
        double inputNumberFromUser;
        double oneFifthOfUserInputNumber;

        //User Input Data
        System.out.println("\nDigite um número real qualquer, usando vírgula (,) para separar a parte decimal: ");
        inputNumberFromUser = userInput.nextDouble();

        //Data Processing
        oneFifthOfUserInputNumber = inputNumberFromUser / 5;

        //Program Output
        System.out.println("\nA quinta parte do número digitado é: " + oneFifthOfUserInputNumber);
        System.out.println();

        userInput.close();

    }

}
