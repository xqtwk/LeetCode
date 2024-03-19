package jv;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindTheDifferenceOfTwoArrays {
    public static void main(String[] args) {

    }

    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> answer = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num : nums1) {
            set1.add(num);
        }

        for (int num : nums2) {
            set2.add(num);
        }

        Set<Integer> difference1 = new HashSet<>(set1);
        Set<Integer> difference2 = new HashSet<>(set2);
        difference1.removeAll(set2);
        difference2.removeAll(set1);
        answer.add(new ArrayList<>(difference1));
        answer.add(new ArrayList<>(difference2));
        return answer;
    }
}
