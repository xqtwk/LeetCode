package jv;

public class CountGoodNodesInBinaryTree {
    int count = 0;
    public int goodNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        traverse(root, root.val);
        return count;
    }

    private void traverse(TreeNode root, int max) {
        if (root == null) {
            return;
        }

        if (root.val >= max) {
            count++;
            System.out.println(count);
            max = root.val;
        }

        traverse(root.left, max);
        traverse(root.right, max);
    }
}
