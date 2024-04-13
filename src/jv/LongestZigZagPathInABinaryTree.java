package jv;

public class LongestZigZagPathInABinaryTree {
    int max = 0;

    public int longestZigZag(TreeNode root) {
        if (root == null) return 0;
        dfs(root.left, true, 1);
        dfs(root.right, false, 1);
        return max;
    }

    public void dfs(TreeNode root, boolean isLeft, int counter) {
        if (root == null) return;
        max = Math.max(max, counter);
        if (isLeft) {
            dfs(root.right, false, counter + 1);
            dfs(root.left, true, 1);
        } else {
            dfs(root.left, true, counter + 1);
            dfs(root.right, false, 1);
        }
    }






    /* OLD FILE
        int max = 0;
    public int longestZigZag(TreeNode root) {
        if (root == null) return 0;

        dfs(root.left, 1, 0);
        dfs(root.right, 0, 1);
        return max;
    }
    public void dfs(TreeNode root, int left, int right) {
        if (root == null) return;
        max = Math.max(max, Math.max(left, right));
        dfs(root.left, right+1,0);
        dfs(root.right, 0, left+1);
    }
     */
}
