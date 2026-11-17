package Unit_test;

// Class nevén alt+enter, és create test. 5-ös verizó, setUp @Before, és az összes változó.

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Nem oszthatunk nullával!");
        }
        return a / b;
    }

    public boolean isPositive(int number) {
        return number > 0;
    }
}


