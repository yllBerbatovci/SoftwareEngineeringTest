public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        System.out.println("Addition: " + add(a, b));
        System.out.println("Subtraction: " + subtract(a, b));
        System.out.println("Multiplication: " + multiply(a, b));
        System.out.println("Division: " + divide(a, b));
        System.out.println("Modulus: " + modulus(a, b));
        System.out.println("Exponentiation: " + exponentiation(a, b));


    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int modulus(int a, int b) {
        return a % b;
    }
    public static int exponentiation(int a, int b) {
        return (int) Math.pow(a, b);
    }




    public static double divide(int a, int b) {
        try {
            return (double) a / b;
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero");
            return 0;
        }
    }

}