package jv;

public class Sqrtx_69 {
    public int mySqrt(int x) {
        if (x < 2) return x;
        long start = 1;
        long end = x / 2;
        while (start <= end) {
            long mid = (start + end) / 2;
            if ( mid * mid > x) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return (int) end;
    }
}
