package jv;

public class MaximumNumberOfVowelsInASubstringOfGivenLength {
    public static void main(String[] args) {

    }

    public int maxVowels(String s, int k) {
        char[] array = s.toCharArray();
        int result = 0;
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (isVowel(s.charAt(i))) {
                count++;
            }
            if (i >= k && isVowel(s.charAt(i - k))) {
                count--;
            }
            result = Math.max(result, count);
        }
        return result;
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
