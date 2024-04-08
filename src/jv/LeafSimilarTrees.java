package jv;

import java.util.ArrayList;
import java.util.List;

public class LeafSimilarTrees {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> sequence1 = new ArrayList<>();
        List<Integer> sequence2 = new ArrayList<>();

        countValues(root1, sequence1);
        countValues(root2, sequence2);
        return sequence1.equals(sequence2);
    }

    private void countValues(TreeNode root, List<Integer> sequence) {
        if (root == null) {
            return;
        }

        if (root.left != null && root.right != null) {
            countValues(root.left, sequence);
            countValues(root.right, sequence);

        } else {
            sequence.add(root.val);
        }
    }
}
