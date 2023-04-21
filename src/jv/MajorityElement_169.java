package jv;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement_169 {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();
        int result = 0;
        int value = 0;
        for (int num : nums) {
            if (!count.containsKey(num)) {
                count.put(num, 0);
            }
            count.put(num, count.get(num) + 1);
        }

        for (Map.Entry<Integer, Integer> set : count.entrySet()) {
            int setValue = set.getValue();
            if (setValue > value) {
                result = set.getKey();
                value = setValue;
            }
        }
        return result;
    }
}
