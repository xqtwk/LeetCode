package jv;

public class StringCompression {
    public static int compress(char[] chars) {
        StringBuilder stringBuilder = new StringBuilder();
        char letter = chars[0];
        int counter = 1;
        for (int i = 1; i < chars.length; i++) {
            if (letter == chars[i]) {
                counter++;
            } else {
                stringBuilder.append(letter);
                if (counter > 1) {
                    stringBuilder.append(counter);
                }
                letter = chars[i];
                counter = 1;
            }
        }

        stringBuilder.append(letter);
        if (counter > 1) {
            stringBuilder.append(counter);
        }

        char[] c = stringBuilder.toString().toCharArray();
        int length = c.length;

        for (int i = 0; i < length; i++) {
            chars[i] = c[i];
        }

        return length;
    }
}
