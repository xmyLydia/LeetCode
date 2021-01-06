package Tree;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        iterateTree(root, list);
        return list;
    }

    private void iterateTree(TreeNode node, List<Integer> list) {
        if (node == null) {
            return;
        }
        iterateTree(node.left, list);
        list.add(node.val);
        iterateTree(node.right, list);
    }
}
