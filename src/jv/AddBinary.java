package jv;

import java.util.ArrayList;
import java.util.List;

public class AddBinary {
    public static String addBinary(String a, String b) {
        List<Integer> aDigits = convertToIntList(a);
        List<Integer> bDigits = convertToIntList(b);
        List<Integer> resultDigits = new ArrayList<>();
        int carry = 0;
        while (!aDigits.isEmpty() || !bDigits.isEmpty() || carry != 0) {
            int sum = carry;
            if (!aDigits.isEmpty()) {
                sum += aDigits.remove(aDigits.size() - 1);
            }
            if (!bDigits.isEmpty()) {
                sum += bDigits.remove(bDigits.size() - 1);
            }
            resultDigits.add(0, sum % 2);
            carry = sum / 2;
        }
        StringBuilder sb = new StringBuilder();
        for (int digit : resultDigits) {
            sb.append(digit);
        }
        return sb.toString();
    }

    private static List<Integer> convertToIntList(String s) {
        List<Integer> digits = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            digits.add(s.charAt(i) - '0');
        }
        return digits;
    }
}
