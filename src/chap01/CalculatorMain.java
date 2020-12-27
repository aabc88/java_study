package chap01;

public class CalculatorMain {
    public static void main(String[] args) {
        System.out.println("Calculator class started");
        Calculator calculator = new Calculator();

        int a = 10;
        int b = 5;
        System.out.println(calculator.add(a, b));
        System.out.println(calculator.subtract(a, b));
        System.out.println(calculator.multiply(a, b));
        System.out.println(calculator.divide(a, b));
    }
}
