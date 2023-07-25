package jv;

public class StringToInteger_atoi_8 {
    public static void main(String[] args) {
    }
    public int myAtoi(String s) {
        StringBuffer atoi = new StringBuffer();

        s = s.trim();

        if (s.length() == 0) {
            return 0;
        }

        int i = 0;

        if (s.charAt(i) == '-' || s.charAt(i) == '+') {
            atoi.append(s.charAt(i));
            i++;
        }

        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            atoi.append(s.charAt(i));
            i++;
        }

        if (atoi.length() == 0 || (atoi.length() == 1 && (atoi.charAt(0) == '-' || atoi.charAt(0) == '+'))) {
            return 0;
        }

        try {
            return Integer.parseInt(atoi.toString());
        } catch (NumberFormatException e) {
            return atoi.charAt(0) == '-' ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }
    }
}
