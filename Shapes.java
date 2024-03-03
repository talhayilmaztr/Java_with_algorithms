public class Shapes {
    public static void main(String[] args) {

        // 1. Pattern
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();

        // 2. Pattern
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("-");
            }
            for (int k = 9; k >= i; k--) {
                System.out.print(k);
            }
            System.out.println();
        }
        System.out.println();

        // 3. Pattern
        for (int i = 1; i <= 9; i++) {
            for (int j = 9; j > i; j--) {
                System.out.print("-");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
