package jv;

public class DeleteNodeInABST {
    public static void main(String[] args) {

    }

    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return null;
        }

        if (key < root.val) {
            root.left = deleteNode(root.left, key);
        } else if (key > root.val) {
            root.right = deleteNode(root.right, key);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            TreeNode lowest = root.right;
            while (lowest.left != null) {
                lowest = lowest.left;
            }

            root.val = lowest.val;
            root.right = deleteNode(root.right, root.val);
        }
        return root;
    }
}
