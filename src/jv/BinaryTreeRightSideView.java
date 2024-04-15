package jv;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeRightSideView {
    public static void main(String[] args) {
    }

    public List<Integer> rightSideView(TreeNode root) {
        if (root == null) return new ArrayList<>();

        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            TreeNode previous = queue.peek();

            while (size > 0) {
                TreeNode temp = queue.poll();


                assert temp != null;
                if (temp.left != null) queue.add(temp.left);
                if (temp.right != null) queue.add(temp.right);

                temp = previous;
                size--;
            }
            list.add(previous.val);
        }

        return list;
    }

}
