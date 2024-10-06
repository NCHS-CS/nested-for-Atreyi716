public class Challenge {
    public static void main(String[] args) {
        for (var i = 1; i <= 9; i++) {
            for (var j = 9-i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (var j = 1; j <= i*2; j++) {
                System.out.print(i);        
            }
            System.out.println();
        }
        for (var i = 8; i >= 1; i--) {
            for (var j = 9-i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (var j = 1; j <= i*2; j++) {
                System.out.print(i);        
            }
            System.out.println();
        }
    }
}
