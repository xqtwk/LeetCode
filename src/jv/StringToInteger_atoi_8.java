package jv;

public class StringToInteger_atoi_8 {
    public static void main(String[] args) {
    }
    public int myAtoi(String s) {
        int i = 0;
        int sign = 1;
        int result = 0;

        while (i < s.length() && s.charAt(i) == ' ') {
            i++;
        }

        if (i < s.length() && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
            sign = (s.charAt(i++) == '-') ? -1 : 1;
        }

        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            if (result > (Integer.MAX_VALUE - (s.charAt(i) - '0')) / 10) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            result = result * 10 + (s.charAt(i++) - '0');
        }

        return result * sign;
    }

    /*
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
    */
}
