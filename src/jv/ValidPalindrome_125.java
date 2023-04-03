package jv;

public class ValidPalindrome_125 {
    public boolean isPalindrome(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                stringBuilder.append(c);
            }
        }
        String newString = stringBuilder.toString().toLowerCase();
        int i = 0, j = newString.length() - 1;
        while (i < j) {
            if (newString.charAt(i) != newString.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
