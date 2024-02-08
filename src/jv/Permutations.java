package jv;

import java.util.*;

class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> numbers = new ArrayList<>();
        for (int num : nums) {
            numbers.add(num);
        }
        List<List<Integer>> result = new ArrayList<>();
        permutations(numbers, result, 0);
        return result;
    }

    private void permutations(List<Integer> numbers, List<List<Integer>> result, int index) {
        if (index == numbers.size()) {
            result.add(new ArrayList<>(numbers));
            return;
        }
        for (int i = index; i < numbers.size(); i++) {
            Collections.swap(numbers, index, i);
            permutations(numbers, result, index + 1);
            Collections.swap(numbers, index, i);
        }

    }
}
