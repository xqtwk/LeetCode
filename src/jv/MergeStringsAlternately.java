package jv;

public class MergeStringsAlternately {
    public static void main(String[] args) {

    }

    public String mergeAlternately(String word1, String word2) {
        char[] chars1 = word1.toCharArray();
        char[] chars2 = word2.toCharArray();
        int word1Length = word1.length();
        int word2Length = word2.length();
        int finalLength = word1Length + word2Length;
        char[] result = new char[finalLength];
        int first = 0, second = 0;

        for (int i = 0; i < finalLength; i++) {
            if (i % 2 == 0 && first < word1Length) {
                result[i] = chars1[first];
                first++;
            } else if (second < word2Length) {
                result[i] = chars2[second];
                second++;
            } else {
                result[i] = chars1[first];
                first++;
            }
        }

        return new String(result);
    }
}
