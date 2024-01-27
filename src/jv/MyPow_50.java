package jv;

public class MyPow_50 {
    public double myPow(double x, int n) {
        double result = x;
        if (n < 0) {
            while (n < 1) {
                result /= 1 / x;
                n--;
            }
        } else {
            while (n > 1) {
                result *= x;
                n--;
            }
        }
        return result;
    }
}
