package jv;

import java.util.*;
import java.util.stream.Collectors;

class Permutations_46 {
    public static void main(String[] args) {
        Permutations_46 p = new Permutations_46();
        int[] nums = {1,2,3,4};
        System.out.println(p.permute(nums));
    }
    public List<List<Integer>> permute(int[] nums) {
        int count = 0;
        List<Integer> numbers = Arrays.stream(nums).boxed().collect(Collectors.toList());
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i < numbers.size(); i++) {
            List<Integer> newNumbers = new ArrayList<>();

            if (i < numbers.size()-1) {
                for(int j = i+1; j < numbers.size(); j++) {

                }
            }
        }
        /*for(int i = 0; i < factorial(numbers.size()); i++) {
            List<Integer> newNumbers = new ArrayList<>();
        }*/
        return result;
    }
    public int factorial(int n) {
        if (n <= 2) {
            return n;
        }
        return n * factorial(n - 1);
    }
}
