public class App {
    /*public static void mystery3() {
        int foo = 3;
        for (int number = 0; foo > number; number += 2) {
            foo++;
            System.out.println(foo + " " + number);
        }
    }*/
    public static void main(String[] args) {
    //  mystery3();
        int Rows = 5;

        // Outer loop for rows
        for (int i = 1; i <= Rows; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }

        int maxRows = 5;
        int period = 4;

        // Outer loop for rows
        for (int i = 1; i <= maxRows; i++) {
            // Print leading spaces
            for (int j = 1; j <= period; j++) {
                System.out.print(".");
            }
            // Print numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
            period--; // Decrement periods
        }

        for (int i = 1; i <= 5; i++) {
            // Print leading dots
            for (int j = 5; j > i; j--) {
                System.out.print(".");
            }
            // Print the number
            System.out.print(i);
            // Print trailing dots
            for (int j = 1; j < i; j++) {
                System.out.print(".");
            }
            // Move to the next line
            System.out.println();
    
        }
    }
}
