package jv;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        LongestCommonPrefix longestCommonPrefix_ = new LongestCommonPrefix();
        String[] a = {"reflower","flow","flight"};
        System.out.println(longestCommonPrefix_.longestCommonPrefix(a));
    }
    public String longestCommonPrefix(String[] strs) {
        String shortest = strs[0];
        String currentPrefix = "";
        boolean contains = true;
        String finalPrefix = "";
        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length() < shortest.length()) {
                shortest = strs[i];
            }
        }

        for (int i = 0; i < shortest.length(); i++) {
            currentPrefix += Character.toString(shortest.charAt(i));
            for (int j = 0; j < strs.length; j++) {
                if (strs[j].charAt(i) == shortest.charAt(i)) {
                    contains = true;
                } else {
                    contains = false;
                }
            }
            if (contains == true) {
                System.out.println(currentPrefix);
                finalPrefix = currentPrefix;
            }
        }
        return finalPrefix;

    }
}
