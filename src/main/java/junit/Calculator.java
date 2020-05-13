package junit;

public class Calculator {
    public static int arithmeticSeries(int n) {
        if (n == 1) {
            return 1;
        } else if (n < 1) {
            return 0;
        } else {
            Calculator p = new Calculator();
            return n + p.arithmeticSeries(n - 1);
        }
    }
}