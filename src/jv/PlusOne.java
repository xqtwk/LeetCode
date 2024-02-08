package jv;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        boolean carry = true;
        int i = digits.length - 1;
        while (i >= 0 && carry) {
            digits[i]++;
            carry = digits[i] > 9;
            digits[i] %= 10;
            i--;
        }
        if (carry) {
            int[] ans = new int[digits.length + 1];
            ans[0] = 1;
            return ans;
        }
        return digits;
    }
}
