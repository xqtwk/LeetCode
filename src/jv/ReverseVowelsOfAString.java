package jv;

public class ReverseVowelsOfAString {
    public static void main(String[] args) {

    }

    public String reverseVowels(String s) {
        char[] array = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            if (isVowel(array[i]) && isVowel(array[j])) {
                char temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            } else if (isVowel(array[i])) {
                j--;
            } else if (isVowel(array[j])) {
                i++;
            } else {
                i++;
                j--;
            }
        }

        return new String(array);
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
               c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}
