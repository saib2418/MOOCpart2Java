package javamoocpart2;


import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.valueOf(scanner.nextLine());

        if (number < 0) {
            int nonnegativenumber = -1 * number;
            System.out.println(nonnegativenumber);
        } else {
            System.out.println(number);
        }
    }
}
