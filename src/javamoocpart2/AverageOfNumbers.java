package javamoocpart2;


import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0.0;
        double count = 0.0;
        double average = 0.0;
        while (true) {
            System.out.println("Give a number: ");
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                break;
            }

            if (number != 0) {
                sum = sum + number;
                count++;
            }
            average = sum / count;
        }
        System.out.println("Average of the numbers: " + average);
    }
}
