package Section04;

import java.util.Scanner;

public class Exercise03 {

    public static void main(String[] args) {
        
        //Exercise03 - Peça ao usuário para digitar três valores inteiros e imprima a soma deles.

        Scanner userInput = new Scanner(System.in);
        int number01;
        int number02;
        int number03;
        int sum;

        //User Input data
        System.out.println("\nDigite o 1º número: ");
        number01 = userInput.nextInt();
        System.out.println("\nDigite o 2º número: ");
        number02 = userInput.nextInt();
        System.out.println("\nDigite o 3º número: ");
        number03 = userInput.nextInt();

        //Data Processing
        sum = number01 + number02 + number03;

        //Program Output Information
        System.out.println("\nA soma dos números digitados é: " + sum);
        System.out.println();

        userInput.close();
        
    }

}