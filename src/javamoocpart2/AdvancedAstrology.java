package javamoocpart2;

public class AdvancedAstrology {  // class declaration

    public static void printStars(int number) {  // custom method to print specified number of stars
        int i = 1;      // initialization: starts at 1
        while (i <= number) { // condition: until counter equals the number specified 
            System.out.print("*");  // functionality: print '*' on each iteration
            i++;     // re-initialization: increment counter on each iteration
        }
    }  // returns VOID

    public static void printSpaces(int number) {  // custom method to print spaces
        int i = 1;              // initialization: starts at 1
        while (i <= number) {     // condition: runs until counter equals specified number
            System.out.print(" ");  // functionality: prints space (" ") on each iteration
            i++;  // re-initialization: increments counter 
        }
    }  // returns VOID

    public static void printTriangle(int size) {  // custom method to print a triangle of specified size
        int i = 1;     // initialization: starts at 1
        int spaces = size;   // duplicate variable used to print number of spaces
        while (i <= size) {  // condition: until counter equals size
            printSpaces(spaces);  // functionality: print 'spaces' number of spaces
            printStars(i);        // then print 'i' (counter) number of stars
            spaces--;             // re-initialization: decrement spaces on every iteration (space reduces as stars increase)
            i++;                  // increment stars on every iteration (stars increases as space decrements)
            System.out.println(); // move to next line after each line
        }
    } // returns VOID

    public static void christmasTree(int height) {  // custom method to print a christmas tree
        int i = 1;      // initialization: counter starts at 1
        int spaces = height;    // duplicate variable: used to print spaces based on logic
        while (i <= ((2 * height) - 1)) {   // condition: runs until required numbers of stars are printed
            printSpaces(spaces - 1);        // functionality: calls the method printSpaces with the argument (spaces-1), so that it prints 1 space less than 'height', a space reserved to print the first star
            printStars(i);             // calls printStars method with argument as counter
            spaces--;                 // re-initialization: acc to pattern, spaces reduce by 1 on each line
            i += 2;                  // acc to pattern, stars increase in odd multiples (1,3,5,7,..) on every line, thus, counter increases by 2 on each line
            System.out.println();    // move to next line after each iteration
        }

        // to print base of christmas tree
        i = 1;         // re-initialize counter to 1 for a new loop
        while (i <= 2) {    // condition: only need to print 2 lines, thus, counter runs twice
            printSpaces(height - 2);  // functionality: acc to pattern, 2 spaces are required for triangle of size 4, while 8 spaces are required for triangle of size 10
            printStars(3);          // acc to pattern, always 3 stars are printed on a single line
            System.out.println();   // move to next line on each iteration
            i++;           // re-initialization: counter increases as we jump to next line
        }
    }  // returns VOID

    public static void main(String[] args) {  // main method
        // The tests are not checking the main, so you can modify it freely.

        // calling all method
        printTriangle(4);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    } // returns VOID
}
