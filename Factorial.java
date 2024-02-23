public class Factorial {

    public static int factorial(int number) {
        int result = 1;

        for (int i = 1; i <= number; i++) {
            result *= i; // 1*2*3
        }
        return result;
    }
    // sinx = (x^1 / 1!) - (x^3 / 3!) + (x^5 / 5!) ...
    public static double sinx(int x, int steps) {
        double result = 0;
        int power = 1;

        for (int i = 0; i < steps; i++) {
            if (i % 2 == 0) {
                result += (Math.pow(x, power)) / factorial(power);
            } else {
                result -= (Math.pow(x, power)) / factorial(power);
            }
            power += 2;
        }
        return result;
    }
    // cosx = 1 - (x^2 / 2!) + (x^4 / 4!) - ....
    public static double cosx(int x, int steps) {
        double result = 0;
        int power = 0;

        for (int i = 0; i < steps; i++) {
            if (i % 2 == 0) {
                result += (Math.pow(x, power)) / factorial(power);
            } else {
                result -= (Math.pow(x, power)) / factorial(power);
            }
            power += 2;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(sinx(2, 2));
        System.out.println(cosx(2, 2));
    }
}
