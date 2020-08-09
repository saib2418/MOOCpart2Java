package javamoocpart2;


import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give numbers:");
        double sum = 0;
        double count = 0;
        double average = 0;
        int oddNumbers = 0;
        int evenNumbers = 0;

        while (true) {

            int number = Integer.valueOf(scanner.nextLine());

            if (number == -1) {
                System.out.println("Thx!Bye!");
                break;
            }
            if (number != -1) {
                sum = sum + number;
                count = count + 1;
                average = sum / count;
            }
            if (number % 2 != 0) {
                oddNumbers = oddNumbers + 1;
            }
            if (number % 2 == 0) {
                evenNumbers = evenNumbers + 1;
            }

        }

        System.out.println("Sum:" + sum);
        System.out.println("Numbers:" + count);
        System.out.println("Average:" + average);
        System.out.println("Even:" + evenNumbers);
        System.out.println("Odd:" + oddNumbers);
    }
}
