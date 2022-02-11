package academy.learnprogramming;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your weight in pounds: ");
        double pounds = input.nextDouble();
        double kiloWeight = pounds * 0.45359237;
        System.out.printf("You weight %.2f in pounds and %.2f in kilograms.", pounds, kiloWeight);




    }
}
