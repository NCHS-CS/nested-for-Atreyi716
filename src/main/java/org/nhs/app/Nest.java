public class Nest {
    public static void main(String[] args) {
        for (var i = 1; i <= 5; i++) {
            for (var j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
        int rows = 4;
        int sequenceLength = 10;

        // Outer loop for rows
        for (int i = 0; i < rows; i++) {
            // Inner loop for sequences in reverse order
            for (int j = sequenceLength - 1; j >= 0; j--) {
                // Print digits for each sequence
                for (int k = 0; k < j; k++) {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}
