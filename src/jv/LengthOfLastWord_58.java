package jv;

public class LengthOfLastWord_58 {
    public int lengthOfLastWord(String s) {
        int length = 0;
        char[] chars = s.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            if (chars[i] != ' ') {
                length++;
                if (i != 0 && chars[i - 1] == ' ') {
                    return length;
                }
            }
        }
        return length;
    }
}
