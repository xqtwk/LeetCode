package jv;

import java.util.ArrayList;
import java.util.List;

public class PalindromeNumber_9 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        ArrayList n = new ArrayList<>();
    }
    public static boolean isPalindrome(int x) {
        int reversed = 0;
        int temporary = x;
        int digit;
        while (temporary > 0) {
            digit = temporary % 10;
            reversed = reversed*10+digit;
            temporary /= 10;
        }
        return x == reversed ? true : false;
    }
}
