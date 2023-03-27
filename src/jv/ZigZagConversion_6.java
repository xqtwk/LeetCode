package jv;

public class ZigZagConversion_6 {
    public static void main(String[] args) {
        ZigZagConversion_6 zigZagConversion_6 = new ZigZagConversion_6();
        System.out.println(zigZagConversion_6.convert("PAYPALISHIRING",4));
    }
    public String convert(String s, int numRows) {
        return "";
    }
}
 /*StringBuilder result = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            int stringIndex = i;
            boolean up = true;

            while (stringIndex < s.length()) {
                result.append(s.charAt(stringIndex));
                if (i == 0 || i == numRows - 1) {
                    stringIndex += (2 * numRows - 2);
                }
                else {
                    if (up)
                    {
                        stringIndex += (2* (numRows-i) -2);
                    }
                    else {
                        stringIndex += i * 2;
                    }
                    up ^= true;
                }
                System.out.println(result);
            }
        }
        return result.toString();*/