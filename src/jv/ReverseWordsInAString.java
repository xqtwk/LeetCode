package jv;
import java.util.ArrayList;
import java.util.List;

public class ReverseWordsInAString {
    public static void main(String[] args) {
        System.out.println(reverseWords("the sky is blue"));
    }

    public static String reverseWords(String s) {
        char[] chars = s.toCharArray();
        List<String> stringList = new ArrayList<>();
        int i = chars.length - 1;
        while (i >= 0) {
            if (!(Character.compare(chars[i], ' ') == 0)) {
                StringBuilder word = new StringBuilder();
                while (i > -1 && !(Character.compare(chars[i], ' ') == 0)){
                    word.append(chars[i]);
                    i -= 1;
                }
                stringList.add(word.reverse().toString());
            } else {
                i -= 1;
            }
        }
        return String.join(" ", stringList);
    }
}
