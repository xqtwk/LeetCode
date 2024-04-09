package jv;

public class PathSumIII {
    int count = 0;

    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return 0;
        }

        dfs(root, targetSum, 0L);
        pathSum(root.left, targetSum);
        pathSum(root.right, targetSum);

        return count;
    }

    public void dfs(TreeNode root, int target, Long sum) {
        if (root == null) {
            return;
        }

        sum += root.val;
        if (sum == target) {
            count++;
        }
        dfs(root.left, target, sum);
        dfs(root.right, target, sum);
    }
}
